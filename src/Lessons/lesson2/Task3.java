package Lessons.lesson2;
import javax.swing.*;
import java.util.Scanner;


public class Task3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        String name = "- имя";
        String city = "- город";
        String age = "- возраст";
        String hobby = "- хобби";
        String str = scanner.next();
        String str2 = scanner.next();
        int Возраст = scanner.nextInt();
        String str3 = scanner.next();

        String[] columnnames = {
                "1",
                "2"};
        String[][] data = {
                {ANSI_BLUE+str+ANSI_RESET +name},
                {ANSI_BLUE+str2+ANSI_RESET+city},
                {ANSI_BLUE+Возраст+ANSI_RESET+age},
                {ANSI_BLUE+str3+ANSI_RESET+hobby}
        };

        System.out.println( data);



       // System.out.println(ANSI_BLUE+str+ANSI_RESET +name);
       // System.out.println(ANSI_BLUE+str2+ANSI_RESET+city);
       // System.out.println(ANSI_BLUE+Возраст+ANSI_RESET+age);
       // System.out.println(ANSI_BLUE+str3+ANSI_RESET+hobby);
    }
}
