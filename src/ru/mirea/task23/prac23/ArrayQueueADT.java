package ru.mirea.task23.prac23;

class ArrayQueueADT {
    private int maxSize = 15;
    private int[] queue = new int[maxSize];
    private int nElem = 0;
    private int front = 0;
    private int rear = -1;


    public static void enqueue(ArrayQueueADT queue, int elem) {
        if (queue.nElem == queue.maxSize){
            System.out.println("Не может быть добавлено более 15 элементов");
            return;
        }
        if (queue.rear == queue.maxSize - 1) {
            queue.rear = -1;
        }

        queue.queue[++queue.rear] = elem;
        queue.nElem++;
    }
    public static int dequeue(ArrayQueueADT queue) {
        int temp = queue.queue[queue.front++];

        if (queue.front == queue.maxSize) {
            queue.front = 0;
        }
        queue.nElem--;
        return temp;

    }
    public static int element(ArrayQueueADT queue) {
        return queue.queue[queue.front];
    }


    public static void clear(ArrayQueueADT queue){
        queue.rear = -1;
        queue.front = 0;
        queue.nElem = 0;
    }
    public static boolean isEmpty(ArrayQueueADT queue) {
        return (queue.nElem == 0);
    }

    public static int size(ArrayQueueADT queue) {
        return queue.nElem;
    }
    public static void main(String[] args){
        ArrayQueueADT q = new ArrayQueueADT();
        for (int i = 0; i < 15; i++){
            enqueue(q, i+1);
        }
        while (!isEmpty(q)) System.out.print(dequeue(q)+ " ");
    }
}