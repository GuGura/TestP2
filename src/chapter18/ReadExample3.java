package chapter18;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
    public static void main(String[] args) {
        try {
            Reader reader = null;
            //1 문자씩 읽기
            //텍스트 파일로부터 문자 입력 스트림 생성
            reader = new FileReader("C://Temp//test.txt");
            while (true) {
                //1 문자를 읽음
                int data = reader.read();
                //파일을 다 읽으면 while문 종료
                if (data == -1) break;
                //읽은 문자 출력
                System.out.print((char) data);
            }
            reader.close();
            System.out.println();

            //문자 배열로 읽기
            reader = new FileReader("C://Temp//test.txt");
            char[] data = new char[100];
            while (true){
                int num = reader.read(data);
                if (num == -1 )break;
                for (int i = 0 ; i < num ; i++){
                    System.out.print(data[i]);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
