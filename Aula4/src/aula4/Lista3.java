package aula4;
import java.util.Scanner;

public class Lista3 {
    
    public static void lista3(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        
        double peso, altura, imc;
        System.out.println("Digite seu peso");
        peso = input.nextDouble();
        System.out.println("Digite sua altura");
        altura = input.nextDouble();
        imc = peso / (altura*altura);
        System.out.println(imc);
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Você está com um peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Você está um pouco acima do peso (Sobrepeso)");
        } else if (imc <= 34.9) {
            System.out.println("Você está acima do peso (Obesidade Grau I)");
        } else if (imc <= 39.9) {
            System.out.println("Você está bem acima do peso (Obesidade Grau II)");
        } else {
            System.out.println("Você está muito acima do peso (Obesidade Grau III)");
        }
    }
    
}
