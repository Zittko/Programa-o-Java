package aula5;
import java.util.Scanner;

public class Lista5 {
    public static void lista5(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, n2, n3, falta;
        float mnp = (float) (175 * 7.5), media;
        System.out.println("Digite a nota N°1");
        n1 = input.nextInt();
        System.out.println("Digite a nota N°2");
        n2 = input.nextInt();
        System.out.println("Digite a nota N°3");
        n3 = input.nextInt();
        System.out.println("Quantas faltas você teve no ano?");
        falta = input.nextInt();
        media = (float) (n1 + n2 + n3/3);
        
        if (media == 10 && falta == 0) {
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7 && falta >= mnp) {
            System.out.println("Aprovado.");
        } else if (media >= 5 || media <= 6.9 && falta >= mnp) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
