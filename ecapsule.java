import java.util.ArrayList;
import java.util.Scanner;

public class ecapsule {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> visited = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int current = list.get(i);

            if (visited.contains(current)) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(current)) {
                    count++;
                }
            }

            System.out.println(current + " -> " + count);
            visited.add(current);
        }
    }
}