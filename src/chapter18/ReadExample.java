package chapter18;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            //데이터 출발지를 test.db로 하는 입력 스트림 생성
            InputStream is = new FileInputStream("C://Temp//test.db");
            while (true){
                //1byte씩 읽기
                int data = is.read();
                //파일이 끝에 도착했을 경우
                if (data == -1) break;
                System.out.println(data);
            }
            //입력 스트림을 닫고 사용 메모리 해제
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
