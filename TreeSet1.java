import java.util.TreeSet;
public class TreeSet1 {
    public static void main(String[] args){
        TreeSet<String> cars=new TreeSet<>();
        cars.add("Nissan");
        cars.add("Porsche");
        cars.add("Toyota");
        cars.add("Koenigsegg");
        System.out.println(cars);
        cars.remove("Toyota");
        cars.add("Nissan");
        for(String i:cars){
            System.out.println(i);
        }
        cars.clear();
        System.out.println(cars.size());
    }
}
