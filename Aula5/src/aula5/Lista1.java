package aula5;
import java.util.Scanner;

public class Lista1 {

    public static void lista1(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int velp, velc;
        System.out.println("Qual a velocidade permitida na via?");
        velp = input.nextInt();
        System.out.println("Em qual velocidade o carro está?");
        velc = input.nextInt();
        if (velc > velp + 10 && velc <= velp + 11) {
            System.out.println("Receberá uma multa de R$80,00");
        } else if (velc > velp + 11 && velc <= velp + 39) {
            System.out.println("Receberá uma multa de R$120,00");
        } else if (velc >= velp + 40){
            System.out.println("Receberá uma multa de R$200,00");
        } else {
            System.out.println("O carro está dentro da velocidade permitida");
        }
    }
    
    
}
