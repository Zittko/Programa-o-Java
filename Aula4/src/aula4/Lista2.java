package aula4;
import java.util.Scanner;

public class Lista2 {
    
    public static void lista2(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("type in three numbers:");
        System.out.print("Number one: ");
        n1 = input.nextInt(); 
        System.out.print("Number two: ");
        n2 = input.nextInt();
        System.out.print("Number three: ");
        n3 = input.nextInt();
        if (n1 > 0 && n2 > 0 && n3 > 0) {
           System.out.println("It's possible to make a triangle");
           if (n1 == n2 && n2==n3) {
               System.out.println("The triangle equilaterous");
           } else if ((n1 != n2 && n2 != n3 && n3 != n1)) {
               System.out.println("The triangle is isocelis");
           } else {
               System.out.println("The triangle is escalene");
           }
        } else {
            System.out.println("It's not possible to make a triangle");
        }
    }
    
}
