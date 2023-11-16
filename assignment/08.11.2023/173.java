class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        push(root);
    }
    
    private void push(TreeNode node){
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }
    public int next() {
         TreeNode node = stack.pop();
        push(node.right);
        return node.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}