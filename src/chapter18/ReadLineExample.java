package chapter18;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        //FileReader에 BufferedReader 보조 스트림 연결
        BufferedReader br = new BufferedReader(new FileReader("src/chapter18/ReadLineExample.java"));

        int lineNo = 1;
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        //BufferedReader를 닫으면 연결된 FileReader도 닫힘
        br.close();
    }
}
