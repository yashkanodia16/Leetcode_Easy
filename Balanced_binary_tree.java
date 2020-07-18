// Given a binary tree, determine if it is height-balanced.

// For this problem, a height-balanced binary tree is defined as:

// a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

 

// Example 1:

// Given the following tree [3,9,20,null,null,15,7]:

//     3
//    / \
//   9  20
//     /  \
//    15   7
// Return true.

// Example 2:

// Given the following tree [1,2,2,3,3,null,null,4,4]:

//        1
//       / \
//      2   2
//     / \
//    3   3
//   / \
//  4   4
// Return false.

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
    public boolean isBalanced(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    if(root!=null)
        queue.offer(root);
    while(!queue.isEmpty()){
            root = queue.poll();
        if(root.left!=null)
            queue.offer(root.left);
        if(root.right!=null)
            queue.offer(root.right);
        if(Math.abs(maxHeight(root.left)-maxHeight(root.right))>1)
            return false;
        }
        return true;
    }
    public int maxHeight(TreeNode root){
        if(root==null)
            return 0;
        return (Math.max(maxHeight(root.left),maxHeight(root.right))+1); 
    }
}
