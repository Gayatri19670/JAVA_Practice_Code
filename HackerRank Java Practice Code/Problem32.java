package practice_code;
import java.util.Scanner;

public class percentage {
    
    public static void main (String[] args) {
        
        System.out.println("Enter the subjects Marks-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks obtain in Maths = ");
        int num1 = sc.nextInt();
        System.out.print("Marks obtain in English = ");
        int num2 = sc.nextInt();
        System.out.print("Marks obtain in Hindi = ");
        int num3 = sc.nextInt();
        System.out.print("Marks obtain in Physics = ");
        int num4 = sc.nextInt();
        System.out.print("Enter Marks obtain in Chemistry = ");
        int num5 = sc.nextInt();
        int totalMarks = num1 + num2 + num3 + num4 + num5;
        float Percentage = totalMarks / 5;
        System.out.println("Percentage = " + Percentage + "%");

    }
}