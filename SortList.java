import java.util.LinkedList;
import java.util.Collections;
public class SortList {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();
        l.add("A");
        l.addFirst("Z");
        l.addFirst("Z");
        l.addFirst("Z");
        l.addFirst("Z");
        l.addLast("X");
        l.getFirst();
        l.getLast();
        Collections.sort(l);
        for(String s:l){
            System.out.println(s);
        }
        Collections.sort(l,Collections.reverseOrder());
        for(String s:l){
            System.out.println(s);
        }
}}
