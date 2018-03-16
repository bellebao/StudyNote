# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import win32com.client

#--------------------------------CONSTANTS-------------------------------------
wdFormatText = 2


#--------------------------------FUNCTIONS-------------------------------------
def word2txt(docfilename):
    app = win32com.client.Dispatch('Word.Application')
    doc = app.Documents.Open(docfilename)
    txtfilename = docfilename.replace(".doc", ".txt")
    doc.SaveAs(txtfilename, wdFormatText)
    doc.Close()
    return txtfilename

def cli():
    
    filename = "C:\IOSystems\Docs\E435157_2017_Goals.doc"
    word2txt(filename)

if __name__ == "__main__":
    cli()
