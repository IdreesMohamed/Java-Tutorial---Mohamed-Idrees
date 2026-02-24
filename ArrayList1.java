import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1{
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Nissan");
        arr.add(0,"Toyota");
        arr.get(0);
        System.out.println(arr);
        arr.remove(0);
        arr.clear();
        arr.add("Nissan");
        arr.add(0,"Toyota");
        arr.set(0,"Mahindra");
        System.out.println(arr.size());
        Collections.sort(arr);
        for (String a : arr) {
            System.err.println(a);
        }
    }
}