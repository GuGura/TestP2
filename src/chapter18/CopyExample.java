package chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception{
        String originalFileName = "C://Temp//test.jpg"; //파일 들고와서 읽고
        String targetFileName = "C://Temp//test2.jpg";  // 파일을 내보낸다.

        //입출력 스트림 생성
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[500]; //읽은 바이트를 저장할 배열 생성

        is.transferTo(os);
        is.close();
        os.close();
        System.out.println("복사가 잘 되었습니다.");
    }
}
