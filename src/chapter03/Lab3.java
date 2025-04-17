package chapter03;

import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학점 입력
        System.out.print("자바 이수 학점 입력: ");
        int java = scanner.nextInt();
        System.out.print("모바일 이수 학점 입력: ");
        int mobile = scanner.nextInt();
        System.out.print("엑셀 이수 학점 입력: ");
        int excel = scanner.nextInt();

        // 성적 입력
        System.out.print("자바 성적 입력 : ");
        double B = scanner.nextDouble();
        System.out.print("모바일 성적 입력 : ");
        double A0 = scanner.nextDouble();
        System.out.print("엑셀 성적 입력 : ");
        double A = scanner.nextDouble();

        double avg;
        avg = ((java * B) + (mobile * A0) + (excel * A)) / (java + mobile + excel);
        avg = Math.round(avg * 100.0) / 100.0;

        System.out.println("평균 학점 : " + avg);

        scanner.close();
    }
}

