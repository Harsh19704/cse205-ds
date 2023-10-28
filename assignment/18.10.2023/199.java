lass Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightview(root,result,0);
        return result;
    }
    public void rightview(TreeNode current,  List<Integer> result, int currentDepth){
        if(current == null){
            return;
        }
        if(currentDepth == result.size()){
            result.add(current.val);
        }
        rightview(current.right, result, currentDepth + 1);
        rightview(current.left, result, currentDepth + 1);
    }
}