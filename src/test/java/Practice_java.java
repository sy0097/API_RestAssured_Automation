


import java.util.Scanner;

public class Practice_java {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = sc.nextLine();
        String rev = "";
        char ch;
        for (int i = 0; i < a.length(); i++) {

            ch = a.charAt(i);
            if (a.charAt(i) != ' ') {
                rev = rev + ch;
            }
        }
        System.out.println(rev);
    }

}








