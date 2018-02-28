/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<int> v;

    vector<int> preorderTraversal(TreeNode* root) {
        if (root != NULL) {
            v.push_back(root->val);
            preorderTraversal(root->left);
            preorderTraversal(root->right);
        }
        return v;
    }
};

class Solution {
public:
    vector<int> t;
    
    vector<int> inorderTraversal(TreeNode* root) {

        if (root!= NULL) 
        {inorderTraversal(root->left);       
         t.push_back(root->val); 
         inorderTraversal(root->right);
        }

    return t;    
    }
};