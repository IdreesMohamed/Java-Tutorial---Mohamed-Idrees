public class tryCatchFinally {
    public static void main(String[] args) {
        try{
            int[] a={1,2,3,4};
            System.out.println(a[193]);
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Program Executed");
        }
    }
}
