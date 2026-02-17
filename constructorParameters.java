public class constructorParameters {
    int x;
    public constructorParameters(int y){
        x=y;
    }
    public static void main(String[] args) {
        constructorParameters obj=new constructorParameters(10);
        System.out.println(obj.x);
    }
}
