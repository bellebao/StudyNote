# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import win32com.client
import os
import string
#--------------------------------CONSTANTS-------------------------------------
wdFormatText = 2

#--------------------------------GLOBALS---------------------------------------

filenum = 0
#--------------------------------FUNCTIONS-------------------------------------
def word2txt(docfilename):
    app = win32com.client.Dispatch('Word.Application')
    doc = app.Documents.Open(docfilename)
    txtfilename = docfilename.replace(".doc", ".txt")
    doc.SaveAs(txtfilename, wdFormatText)
    doc.Close()
    return txtfilename


def ParseFile(path):
    global filenum    
    if os.path.isdir(path):
        filenum = len(os.listdir(path))
        for sub_dir in os.listdir(path):
            filename = os.path.join(path, sub_dir)
            ParseFile(filename)
    else:
        TraceParser(path)
        
def TraceParser(filename):
    global filenum
    filename = str.lower(filename)
    index = filename.rfind('.')
    
    if (index != -1):
        fileext = filename[index:]
    
    if (fileext in [".doc", ".c", ".cpp", ".s", ".h", ".hpp"]):
        
        filenum = filenum + 1    
        if filename.endswith(".doc"):
            fullname = word2txt(filename)
        else:
            fullname = filename  

def cli():
    
    filename = "C:\IOSystems\\Temp"
    ParseFile(filename)

if __name__ == "__main__":
    cli()
