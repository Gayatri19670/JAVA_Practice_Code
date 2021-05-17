

import java.util.Scanner;

public class Addition {
    
    public static void main (String[] args) {
        System.out.println("Taking input from user--- ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of these numbers = " + sum);


    }
}