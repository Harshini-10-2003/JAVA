package Stack;

import java.util.Arrays;

public class Stack {
    private static int ref = -1;
    private int l = 5;
    int array[];

    Stack() {
        this.array = new int[l];
    }

    public boolean push(int n) {
        ref = ref + 1;
        if (ref == array.length) {
            return false;
        }
        array[ref] = n;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int current = array[ref];
        array[ref] = 0;
        ref = ref - 1; 
        return current;

    }

    public boolean isEmpty() {
        if (ref == -1)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Stack_using_array" + Arrays.toString(array);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
    }
}
