// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its bottom-up level order traversal as:
// [
//   [15,7],
//   [9,20],
//   [3]
// ]

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l1 = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
            return l1;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l2 = new ArrayList<>();
            while(size>0){
                TreeNode node = q.poll();
                l2.add(node.val);
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
                size--;
            }
            l1.add(l2);
        }
        Collections.reverse(l1);
        return l1;
    }
}
