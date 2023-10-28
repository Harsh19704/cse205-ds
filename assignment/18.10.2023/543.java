class Solution {
    int maxVal = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxVal;
    }
    public int height(TreeNode root){
        if(root == null)
        return 0;

        int left = height(root.left);
        int right = height(root.right);

        if(left + right > maxVal)
        maxVal = left + right;
        return Math.max(left,right) +1;
    }
}