

class Box<T>{
    T value;

    void set(T value){
        this.value=value;
    }

    T get(){
        return value;
    }
}
public class Generics {
    public static <T> void printarray(T[] arr){
        for(T i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
    Box<String> strbox=new Box<>();
    strbox.set("Hey");
    System.out.println(strbox.get());

    Integer[] arr={10,20,30};
    printarray(arr);
}}
