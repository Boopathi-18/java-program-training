public class Stack {
    private final java.util.Stack<Integer> data = new java.util.Stack<>();

    public void push(int value) {
        data.push(value);
    }

    public int peek() {
        if (data.empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.peek();
    }

    public int pop() {
        if (data.empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.pop();
    }

    public int search(int value) {
        return data.search(value);
    }

    public boolean empty() {
        return data.empty();
    }

    public int size() {
        return data.size();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Search(20): " + stack.search(20));
        System.out.println("Empty: " + stack.empty());
    }
}
