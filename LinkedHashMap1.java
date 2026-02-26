import java.util.LinkedHashMap;
public class LinkedHashMap1 {
    public static void main(String[]args){
        LinkedHashMap<String,String> cars=new LinkedHashMap<>();
        cars.put("GTR","Nissan");
        cars.put("911","Porsche");
        cars.put("Supra","Toyota");
        cars.put("Jesko","Koenigsegg");
        System.out.println(cars);
        cars.remove("Toyota");
        cars.put("Silvia","Nissan");
        cars.get("GTR");
        for(String i:cars.keySet()){
            System.out.println(i);
        }
        for(String i:cars.values()){
            System.out.println(i);
        }
        cars.clear();
        System.out.println(cars.size());
    }
}
