package aula4;
import java.util.Scanner;

public class lista4 {
    
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        int axle, fee, vehicle;
        
        System.out.println("---*** -- TOLL -- ***---");
        System.out.println("What is the vehicle type?");
        System.out.println("1 - Travelling Car");
        System.out.println("2 - Pickup Truck");
        System.out.println("3 - Bus");
        System.out.println("4 - Truck");
        vehicle = input.nextInt();
        
        
        if (vehicle == 1) {
            System.out.println("The toll fee will be of $10,00 dollars");
        } else if (vehicle == 2) {
            System.out.println("The toll fee will be of $15,00 dollars");
        } else if (vehicle == 3) {
            System.out.println("How many axles does the vehicle has?");
            axle = input.nextInt();
            fee = axle*5;
            System.out.println("The toll fee will be of $"+fee+",00 dollars");
        } else if (vehicle == 4) {
            System.out.println("How many axles does the vehicle has?");
            axle = input.nextInt();
            fee = axle*5;
            System.out.println("The toll fee will be of $"+fee+",00 dollars");
        } else {
            System.out.println("This type of car is not listed, so you'll be feed in $300,00 dollars :)");
        }
    }
    
}
