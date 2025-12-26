import java.util.LinkedList;
import java.util.Queue;

public class queue {

    static void reverseFirstK(Queue<Integer> q, int k) {
        if (k <= 0 || q.isEmpty())
            return;


        int front = q.poll();


        reverseFirstK(q, k - 1);


        q.offer(front);
    }

    static void reverseKElements(Queue<Integer> q, int k) {
        int n = q.size();
        if (k <= 0 || k > n) return;


        reverseFirstK(q, k);

        for (int i = 0; i < n - k; i++) {
            q.offer(q.poll());
        }
    }

    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        reverseKElements(q, 3);
        System.out.println(q);
    }
}

