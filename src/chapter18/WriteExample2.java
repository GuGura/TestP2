package chapter18;

import java.io.*;

public class WriteExample2 {
    public static void main(String[] args) {

        try{
            byte[] bytes = { 10, 20, 30, 40, 50};
            OutputStream os = new FileOutputStream("C:\\Temp\\test2.db");
            os.write(bytes);

            os.flush();
            os.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
