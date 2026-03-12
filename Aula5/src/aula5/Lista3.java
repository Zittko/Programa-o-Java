package aula5;
import java.util.Scanner;

public class Lista3 {
    public static void lista4(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario, imposto ;
        System.out.println("Qual seu salário mensal atual?");
        salario = input.nextFloat();
        if (salario <= 1903.98) {
            System.out.println("Seu imposto será isentado.");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            imposto = (float) (salario * 0.75);
            System.out.println("Seu imposto será de R$"+imposto+" reais.");
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            imposto = (float) (salario * 1.5);
            System.out.println("Seu imposto será de R$"+imposto+" reais.");
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            imposto = (float) (salario * 2.25);
            System.out.println("Seu imposto será de R$"+imposto+" reais.");
        } else {
            imposto = (float) (salario * 2.75);
            System.out.println("Seu imposto será de R$"+imposto+" reais.");
        }
    }
}
