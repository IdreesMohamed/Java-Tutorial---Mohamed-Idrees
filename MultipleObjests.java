public class MultipleObjests {
    int x=5;
    public static void main(String[] args) {
        MultipleObjests ob1=new MultipleObjests();
        MultipleObjests ob2=new MultipleObjests();
        ob2.x=43;
        System.out.println(ob1.x);
        System.out.println(ob2.x);
    }
}
