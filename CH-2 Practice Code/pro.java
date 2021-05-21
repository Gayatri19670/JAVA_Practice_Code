import java.util.Scanner;

public class pro {
    
    public static void main (String[] args) {
        System.out.println("Taking input from user--- ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = input.nextInt();
        System.out.println("Enter Second Number");
        int b = input.nextInt();
       
        int formula1 = (a - b) / 2;
        System.out.println("Formula Resutl 1 = " + formula1);
        System.out.println("Enter Third Number");
        int c = input.nextInt();
        int formula2 = ( b * b - 4 * a * c ) / ( 2 * a );
        System.out.println("Formula Resutl 2 = " + formula2);



    }
}