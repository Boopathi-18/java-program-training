import java.util.ArrayDeque;
import java.util.Deque;

public class SQ {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        
        dq.push(10);
        dq.push(20);
        dq.push(30);

        System.out.println("Stack Pop: " + dq.pop());

        
        dq.offer(40);
        dq.offer(50);

        System.out.println("Queue Poll: " + dq.poll());

        
        System.out.println("Deque: " + dq);
    }
}