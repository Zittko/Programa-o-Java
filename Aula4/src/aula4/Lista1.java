package aula4;

import java.util.Scanner;


public class Lista1 {

    
    public static void lista1(String[] args) {
        Scanner input = new Scanner(System.in);
        double cme, tarifa;
        System.out.println("Qual foi o consumo de energia desse mês?");
        
        cme = input.nextDouble();
        if (cme <= 50) {
            tarifa = 0.2*cme;
            System.out.println("A tarifa é R$"+ tarifa + " Reais");
        } else if (cme <= 150){
            tarifa = 0.25*cme;
            System.out.println("A tarifa é R$"+ tarifa + " Reais");
        } else if (cme <= 300){
            tarifa = 0.3*cme;
            System.out.println("A tarifa é R$"+ tarifa + " Reais");
        } else {
            tarifa = 0.4*cme;
            System.out.println("A tarifa é R$"+ tarifa + " Reais");
        }
    }
    
}
