import java.io.FileInputStream;
import java.io.IOException;
public class fileInputStream {
    public static void main(String[] args) {
        try(FileInputStream f=new FileInputStream("file.txt")){
            int i;
            while((i=f.read())!=-1){
                System.out.println((char)i);
            }
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
