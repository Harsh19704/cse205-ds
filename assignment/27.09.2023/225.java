class MyStack {
     Queue<Integer> queue1;
     Queue<Integer> queue2;
     int topElement;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        queue1.add(x);
        topElement = x;
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }

        int popped = queue1.poll();
        if (!queue1.isEmpty()) {
            topElement = queue1.peek();
        }

        return popped;
    }

    public int top() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }

        return topElement;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}