package model;

import java.util.PriorityQueue;
   

public class Main1 {
    
    private PriorityQueue<Integer> heap;
    private int k;


    public void KthLargest(int k, int[] nums) { //delete word "void" in judge
        this.k = k;
        heap = new PriorityQueue<>(k);
        for (int i : nums)
            add(i);
    }

    public int add(int n) {
        if (heap.size() < k)
            heap.offer(n);
        else if (heap.peek() < n) {
            heap.poll();
            heap.offer(n);
        }
        return heap.peek();
    }

}
