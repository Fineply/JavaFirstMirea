package ru.mirea.task23.prac23;

import java.util.Arrays;

class ArrayQueueModule {
    private int[] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public ArrayQueueModule(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[this.maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public void enqueue(int elem) {
        if (nElem == maxSize){
            System.out.println("Невозможно вставить более " + maxSize + " элементов");
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = elem;
        nElem++;
    }
    public int dequeue() {
        int temp = queue[front++];
        if (front == maxSize) {
            front = 0;
        }
        nElem--;
        return temp;
    }

    public int element() { // 1ый элем.
        return queue[front];
    }

    public void clear(){
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int size() {
        return nElem;
    }

    public static void main(String[] args){
        ArrayQueueModule q = new ArrayQueueModule(15);
        for (int i = 0; i < 15; i++){
            q.enqueue(i);
        }
        System.out.println(q.dequeue());
        System.out.println(q.size());
        System.out.println(q.element());
        System.out.println(q.isEmpty());
        q.clear();
        System.out.println(q.isEmpty());
    }
}