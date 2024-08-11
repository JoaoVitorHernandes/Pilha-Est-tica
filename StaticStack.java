public class StaticStack {
    private int top;
    private int[] data;
    public StaticStack(int size) {
        data = new int[size];
        top = -1;
    }
    public void push(int value) {
        if (!isFull()) {
            data[++top] = value;
        } else {
            System.out.println("Pilha cheia");
        }
    }
    public int pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Pilha vazia");
            return -1;
        }
    }
    public void clear() {
        top = -1;
    }
    public boolean isFull() {
        return top == data.length - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
}