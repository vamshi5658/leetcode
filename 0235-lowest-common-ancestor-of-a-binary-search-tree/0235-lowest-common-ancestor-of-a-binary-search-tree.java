/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int l=Math.max(p.val,q.val);
        int s=Math.min(p.val,q.val);
        if(root.val>l && root.val>s){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(root.val<s && root.val<l){
            return lowestCommonAncestor(root.right,p,q);
        }
        else{
            return root;
        }
    }
}