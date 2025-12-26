import java.util.HashSet;
import java.util.Set;

public class exmple {
    static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        int[] arr = {10,20,30};
        s.add(arr[0]);
        s.add(arr[1]);
        s.add(arr[2]);
        s.remove(arr[1]);
        System.out.println(s);
    }
}
