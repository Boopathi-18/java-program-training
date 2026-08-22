import java.util.*;

public class SQ{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int sum = 0;

        for (int x : queue) {
            sum += x;
        }

        System.out.println("Queue: " + queue);
        System.out.println("Sum = " + sum);
    }
}