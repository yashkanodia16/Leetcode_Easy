// Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
// Example 1:
// Input:
//     3
//    / \
//   9  20
//     /  \
//    15   7
// Output: [3, 14.5, 11]
// Explanation:
// The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
// Note:
// The range of node's value is in the range of 32-bit signed integer.

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l1 = new ArrayList<>();
        if(root==null){
            return l1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        double avg=0;
        while(!queue.isEmpty()){
            double sum = 0;
            double size = queue.size();
            double total = size;
            while(size > 0) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if(temp.left!=null)
                    queue.offer(temp.left);
                if(temp.right!=null)
                    queue.offer(temp.right);
                size--;
            }
            avg = sum/total;
            l1.add(avg);
        }
        return l1;
    }
}