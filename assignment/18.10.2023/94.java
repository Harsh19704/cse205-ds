lass Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> result=new ArrayList<>();
        tree(root,result);
        return(result);
    }
    public void tree(TreeNode root ,List<Integer> result ){
        if(root==null){
            return;
        }
        tree(root.left,result);
        result.add(root.val);
        tree(root.right,result);
    }
}