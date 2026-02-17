public class thisKeyword {
    int x;
    public thisKeyword(int x){
        //x=x;
        this.x=x;
    }
    public static void main(String[] args){
        thisKeyword mo=new thisKeyword(10);
        System.out.print(mo.x);
    }
}
