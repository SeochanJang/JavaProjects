package chapter04;

public class Code4_08 {
    private static String 한국폴리텍대학;

    public static void main(String[] args) {
        String str1 = "한국폴리텍대학\n인공지능소프트웨어\n1학년";
        System.out.println(str1);

        String str2 = "Polytech\t\"AISoftware\"\tFreshman";
        System.out.println(str2);

        String str3 = 한국폴리텍대학;
        System.out.println(str3);
         System.out.println("str3.length() = " + str3.length());
    }
}
