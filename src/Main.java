/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //scanner는 사용하기 편하지만 속도가 느리다
        int a = sc.nextInt(), b = sc.nextInt(), result = a*b;

        while(b>0){
            System.out.println(a*(b%10));
            b/=10;
        }
        System.out.println(result);
    }
}*/

//bufferedreader 사용

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{    //예외처리 필
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int a = br.read();   //입력받을 값이 int 일때
        //String s = br.readLine();   //입력받을 값이 String일떄
        int b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine()), result = b*c;    //int값+엔터 까지 입력받을때
        while(c>0){
            System.out.println(b*(c%10));
            c /= 10;
        }
        System.out.println(result);
    }
}
