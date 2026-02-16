public class methodOverloading {
    public static int value(int x, int y){
        return x+y;
    }
    public static double value(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(value(10,20));
        System.out.println(value(10.5,20.5));
    }
}
