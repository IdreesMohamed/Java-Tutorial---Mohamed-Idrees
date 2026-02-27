public class throwKeyword{
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            throw new ArithmeticException("Access Denied");
        }
        else{
            System.out.println("Access Granted");
        }
    }
}