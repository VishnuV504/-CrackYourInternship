class MyStack {
    List<Integer>li = new ArrayList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        li.add(x);
        
    }
    
    public int pop() {
        int x=li.get(li.size()-1);
        li.remove(li.size()-1);
        return x;
        
    }
    
    public int top() {
       return li.get(li.size()-1);
        
    }
    
    public boolean empty() {
        return li.size()==0;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */