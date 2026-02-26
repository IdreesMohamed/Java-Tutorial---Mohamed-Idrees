import java.util.HashSet;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> l=new HashSet<>();
        l.add("A");
        l.add("Z");
        l.add("Z");
        l.add("Z");
        l.add("Z");
        l.add("X");
        l.remove("A");
        l.contains("A");
        l.size();
        for(String a:l){
            System.out.println(a);
        }
}}
