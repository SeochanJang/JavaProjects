package chapter02;

import java.util.Scanner;
public class Lab01 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in); //문자열 입력
        Scanner s2=new Scanner(System.in); //숫자 입력

        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");

        System.out.print("받는 사람 : ");
        String name =s1.next();
        System.out.print("주소 : ");
        String addr=s1.next();
        System.out.print("무게(g) ");
        int weight=s2.nextInt();

        int price = weight*5;

        System.out.println("** 받는 사람 ==>" + name + "님");
        System.out.println("** 주소 ==>" + addr);
        System.out.println("** 배송비 ==>" + price + "원");

        s1.close();
        s2.close();
    }
}
