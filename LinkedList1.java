import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();
        l.add("A");
        l.addFirst("Z");
        l.addFirst("Z");
        l.addFirst("Z");
        l.addFirst("Z");
        l.addLast("X");
        l.removeFirst();
        l.removeLast();
        l.getFirst();
        l.getLast();
        for(String x:l){
            System.out.println(x);
        }
    }
}
