import java.util.Scanner;

import java.util.Scanner;

public class ConvertorKM2Miles {
    public static void main(String[] args) {
        
        System.out.print("Enter the values in KM : ");
        Scanner input = new Scanner(System.in);
        float Value = input.nextFloat();
        float Convert = Value * 0.621371f;
        System.out.println(Value +" KM = " + Convert +" Miles");
    }
}
