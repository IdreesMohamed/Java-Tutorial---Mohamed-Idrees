public class lastdigit {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int len = a.length / 2;
        for (int i = 0; i < len; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println("reversed element:");
        for (int n1 : a) {

            System.out.println(n1);
        }
    }
}
