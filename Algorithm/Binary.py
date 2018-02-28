# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
list=[]
class Solution:
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if(root != None):  
            self.inorderTraversal(root.left)
            list.append(root.val)

            self.inorderTraversal(root.right)       
        print (list)