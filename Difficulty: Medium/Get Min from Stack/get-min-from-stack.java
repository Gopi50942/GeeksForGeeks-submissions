import java.util.Stack;

class SpecialStack { 
    private Stack<Integer> stack; 
    private Stack<Integer> tmp; 

    public SpecialStack() { 
        stack = new Stack<>(); 
        tmp = new Stack<>(); 
    } 

    public void push(int x) { 
        stack.push(x); 
        if (tmp.isEmpty() || x <= tmp.peek()) { 
            tmp.push(x); 
        } 
    } 

    public void pop() { 
        if (stack.isEmpty()) {
            return; // Guard against empty pop
        }
        if (stack.peek().equals(tmp.peek())) { 
            tmp.pop(); 
        } 
        stack.pop(); 
    } 

    public int peek() { 
        if (stack.isEmpty()) {
            return -1; // Or throw a custom error/return Integer.MIN_VALUE
        }
        return stack.peek(); 
    } 

    public boolean isEmpty() { 
        return stack.isEmpty(); 
    } 

    public int getMin() { 
        if (tmp.isEmpty()) {
            return -1; // Guard against empty getMin
        }
        return tmp.peek(); 
    } 
}
