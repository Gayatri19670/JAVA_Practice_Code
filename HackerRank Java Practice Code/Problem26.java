

import java.util.Scanner;
import java.util.regex.Pattern;

public class ToGreets {
    public static void main(String[] args) {
  
        System.out.print("Hey what's your Name : ");
        Scanner input = new Scanner(System.in);
        String Name = input.next();
        System.out.println("Hello " + Name + ", have a good day !");

    }
}
