import java.util.ArrayList;
import java.util.Iterator;
public class Iterator1 {
    public static void main(String[] args) {
    ArrayList<String> arr=new ArrayList<>();
        arr.add("Nissan");
        arr.add(0,"Toyota");
        arr.get(0);
        arr.add("Nissan");
        arr.add(0,"Toyota");
        arr.set(0,"Mahindra");
        Iterator<String> it=arr.iterator();
        System.out.println(it.next()); 

        while(it.hasNext()){
            System.out.println(it.next());  
        }

        while(it.hasNext()){
            it.remove();

        }

        while(it.hasNext()){
            System.out.println(it.next());  
        }

}
}