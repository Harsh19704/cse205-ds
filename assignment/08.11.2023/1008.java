class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return ans(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode ans(int[]pre,int max,int i[]){
        if(i[0]==pre.length || pre[i[0]]>max){
            return null;
        }
        
        TreeNode root=new TreeNode(pre[i[0]++]);
        root.left=ans(pre,root.val,i);
        root.right=ans(pre,max,i);
        return root;
    }
}