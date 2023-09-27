class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
        min = Math.min(val, minStack.isEmpty() ?val :minStack.peek());
        minStack.push(min);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();

    }
}