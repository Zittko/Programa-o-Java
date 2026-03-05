package aula4;
import java.util.Scanner;

public class lista4 {
    
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        String vehicle;
        int axle, fee;
        
        System.out.println("What's the car type? (travveling/pickup/bus/truck");
        vehicle = input.next();
        
        
        if (vehicle.equalsIgnoreCase("travelling")) {
            System.out.println("The toll fee will be of $10,00 dollars");
        } else if (vehicle.equalsIgnoreCase("pickup")) {
            System.out.println("The toll fee will be of $15,00 dollars");
        } else if (vehicle.equalsIgnoreCase("bus")) {
            System.out.println("How many axles does the vehicle has?");
            axle = input.nextInt();
            fee = axle*5;
            System.out.println("The toll fee will be of $"+fee+",00 dollars");
        } else if (vehicle.equalsIgnoreCase("truck")) {
            System.out.println("How many axles does the vehicle has?");
            axle = input.nextInt();
            fee = axle*5;
            System.out.println("The toll fee will be of $"+fee+",00 dollars");
        } else {
            System.out.println("This type of car is not listed, so you'll be feed in $300,00 dollars :)");
        }
    }
    
}
