/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        calc(root,0,a);
        return a;
    }
    public void calc(TreeNode root,int level,List<Integer> a){
        if(root==null){
            return;
        }
        if(level==a.size()){
            a.add(root.val);
        }
        calc(root.right,level+1,a);
        calc(root.left,level+1,a);
    }
}