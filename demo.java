import java.util.*;
class Node1
{
    int data;
    Node1 add;
    public Node1(int data)
    {
        this.data=data;
        this.add=null;
    }
}
public class demo {
    public static Node1 nodeCreation(int data)
    {
        Node1 newNode=new Node1(data);
        return newNode;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        HashMap<Integer,ArrayList<Node1>>map=new HashMap();
        for(int i=1;i<=10;i++) {
            d = sc.nextInt();
            Node1 newNode1 = nodeCreation(d);
            map.putIfAbsent(d, new ArrayList<>());
            map.get(d).add(newNode1);
        }
        map.forEach((key,val)-> {
            System.out.print(key + ": ");
            for (Node1 nn : val) {
                System.out.print(nn.data +" ");
            }
            System.out.println();
        });

    }
}