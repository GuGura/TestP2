package chapter18;

import java.io.*;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.print("마치 ");
        ps.println("프린터가 출력하는 것처럼");
        ps.println("데이터를 출력합니다.");
        ps.printf("| %6d | %-10s | %10s | \n",1,"홍길동","도적");
        ps.printf("| %6d | %-10s | %10s | \n",2,"감자바","학생");


        Reader reader = new FileReader("C:/Temp/printstream.txt");
        BufferedReader br = new BufferedReader(reader);

        while (true){
            String str = br.readLine();
            if (str == null) break;
            System.out.println(str);
        }
        br.close();
        reader.close();
        ps.flush();
        ps.close();
    }
}
