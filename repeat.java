import java.util.*;
import java.util.LinkedList;

public class repeat {

    static void main(String[] args) {

        int[] stream = {4, 5, 4, 5, 3, 2};

        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();


        for (int num : stream) {

            freq.put(num, freq.getOrDefault(num, 0) + 1);
            q.offer(num);

            while (!q.isEmpty() && freq.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(q.peek());
            }
        }
    }
}
