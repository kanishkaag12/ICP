class MinStack {
    PriorityQueue<Integer> pq;
    ArrayList<Integer> list;
    public MinStack() {
        pq = new PriorityQueue<>();
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        pq.add(val);
        list.add(val);
    }
    
    public void pop() {
        int v = list.get(list.size()-1);
        list.remove(list.size()-1);
        pq.remove(v);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return pq.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */