package Java_College;

import java.util.Scanner;

public class Lab_03 {

    public static void main(String[] args) throws Exception {

        // findIndex(new int[] { 1, 2, 3, 2, 1 });

        initializeArray();

        implement2DArray();

        int[] arr = { 5, 4, 3, 2, 1, 9, 7, 0 };
        BubbleSortLTR(arr);
        for (int ele : arr)
        System.out.print(ele + ", ");
        System.out.println();

        Area(10, 20);
        Area(10.0, 25.0);
        Area(10.0);

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();

        Queue q = new Queue(50);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
    }

    public static void findIndex(int[] arr) {
        int[] ps = new int[arr.length];
        int[] ss = new int[arr.length];
        for (int i = 1; i < arr.length; i++)
            ps[i] = ps[i - 1] + arr[i - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            ss[i] = ss[i + 1] + arr[i + 1];
        for (int i = 0; i < arr.length; i++)
            if (ps[i] == ss[i])
                System.out.println(i);
    }

    public static void initializeArray() {
        Scanner scn = new Scanner(new java.io.InputStreamReader(System.in));
        int[] arr = new int[4];
        float avg = 0F;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
            avg += (float) arr[i];
        }
        System.out.println("Average : " + avg / 4.0);
    }

    public static void implement2DArray() {
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                arr[i] = new int[] { 32 };
            else if (i == 1)
                arr[i] = new int[] { 500, 300 };
            else
                arr[i] = new int[] { 30, 45, 600 };
        }
        for (int[] a : arr) {
            for (int ele : a)
                System.out.print(ele + ", ");
            System.out.println();
        }
    }

    public static void BubbleSortLTR(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Area of Rectangle
    public static void Area(int l, int b) {
        System.out.println("Area of Rectangle : " + l * b);
    }

    // Area of Triangle
    public static void Area(double b, double h) {
        System.out.println("Area of Triangle : " + (0.5) * b * h);
    }

    // Area of Circle
    public static void Area(double r) {
        System.out.println("Area of Circle : " + (Math.PI) * Math.pow(r, 2));
    }

}

class Stack {

    protected int[] arr;
    protected int size = 0;
    protected int tos = -1;

    public Stack() {
        this.arr = new int[25];
    }

    public Stack(int capicity) throws Exception {
        if (capicity < 0)
            throw new Exception("Capacity cannot be Negative");
        this.arr = new int[capicity];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.arr.length;
    }

    public int size() {
        return this.size;
    }

    public void push(int data) throws Exception {
        if (this.isFull())
            throw new Exception("Stack is Full :( ");
        this.tos++;
        arr[tos] = data;
        this.size++;
    }

    public int pop() throws Exception {
        if (this.isEmpty())
            throw new Exception("Stack is Empty :( ");
        int rv = arr[this.tos];
        arr[this.tos--] = 0;
        this.size--;
        return rv;
    }

    public int peek() throws Exception {
        if (this.isEmpty())
            throw new Exception("Stack is Empty :( ");
        return arr[this.tos];
    }

    public void display() {
        for (int i = 0; i <= this.tos; i++)
            System.out.print(arr[i] + ", ");
        System.out.println();
    }
}

class Queue {

    private int[] arr;
    private int front;
    private int size;

    public Queue(int len) throws Exception {
        if (len < 0)
            throw new Exception("Illegal length");
        this.arr = new int[len];
        this.front = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.arr.length;
    }

    public void enqueue(int val) throws Exception {
        if (this.isFull())
            throw new Exception("Queue is Full");
        int index = (this.front + this.size) % this.arr.length;
        this.arr[index] = val;
        this.size++;
    }

    public int dequeue() throws Exception {
        if (this.isEmpty())
            throw new Exception("Queue is Empty");
        int rv = this.arr[this.front];
        this.arr[this.front] = 0;
        this.front = (this.front + 1) % this.arr.length;
        this.size--;
        return rv;
    }

    public int getFront() throws Exception {
        if (this.isEmpty())
            throw new Exception("Queue is Empty");
        int rv = this.arr[this.front];
        return rv;

    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            int index = (this.front + i) % this.arr.length;
            System.out.print(this.arr[index] + " ");
        }
        System.out.println();
    }
}
