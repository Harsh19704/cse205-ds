class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       Queue<TreeNode> queue =  new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
       if(root == null){
           return ans;
       }
       queue.add(root);
       while(!queue.isEmpty()){
      
           List<Integer> list = new LinkedList<>();
           int n = queue.size();


           for(int i = 0;i<n;i++){
               if(queue.peek().left != null)
               queue.add(queue.peek().left);

               if(queue.peek().right != null)
               queue.add(queue.peek().right);
                 
                list.add(queue.remove().val);
           } 
           ans.add(list);
       }
       return ans;
    }
}