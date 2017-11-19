package Lessons.lesson2;
import java.util.Scanner;

public class Task2 {
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
       String name = "Человек по имени  ";
       String city = "живет в городе  ";
       String age = "Этому человеку  ";
       String hobby = " и любит он заниматься  ";
       String str = scanner.next();
       String str2 = scanner.next();
       int Возраст = scanner.nextInt();
       String str3 = scanner.next();
        System.out.println(ANSI_BLUE+name+ANSI_RESET + str +" " + ANSI_RED+city+ANSI_RESET +str2);
        System.out.println(ANSI_BLUE+age+ANSI_RESET+Возраст+ANSI_BLUE+" лет"+ANSI_RESET+ANSI_RED+hobby+ANSI_RESET+str3);


    }

}

