import java.util.ArrayList;
public class WrapperClass {
    public static void main(String[] args){
        Integer m=10;
        System.out.println(m);

        String s=m.toString();
        System.out.println(s);

        System.out.println(s.length());

        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        for(int i:a){
            System.out.println(i);
        }
    }
}
