import java.io.FileWriter;
import java.io.IOException;
public class writeFile {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("File.txt");
            f.write("Hi! I'm Him");
            f.close();
            System.out.println("Executed");
        } catch (IOException e) {
            System.out.println("Error Occured");
        }
    }
}
