// Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

// Example:
// Given a binary tree
//           1
//          / \
//         2   3
//        / \     
//       4   5    
// Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

// Note: The length of path between two nodes is represented by the number of edges between them.

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
    int ans =1;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;    
        int[] arr = new int[1];
        arr[0] = Integer.MIN_VALUE;
        solve(root, arr);
        return arr[0]-1;
    }
    public int solve(TreeNode root,int[] res) {
        if(root == null)
            return 0;
        int left = solve(root.left, res);
        int right = solve(root.right, res);
        int temp = 1+Math.max(left,right);
        int ans = Math.max(temp, left+right+1);
        res[0] = Math.max(res[0], ans);
        return temp;
    }
}

