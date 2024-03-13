package second.ss;

import java.io.*;

public class Day3_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언
        int count = Integer.parseInt(bf.readLine()); //Int
        for(int i = 0; i < count; i++) {
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(" ")[0]); //Int
            int b = Integer.parseInt(s.split(" ")[1]); //Int
            bw.write((a+b)+ "\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}
