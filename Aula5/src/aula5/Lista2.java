package aula5;
import java.util.Scanner;

public class Lista2 {
    public static void lista2(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pontos = 0, resp;
        System.out.println("----- * QUIZ * -----");
        System.out.println("--- PERGUNTA N°1 ---");
        System.out.println("Quanto é 20 / 4?");
        System.out.println("(1). 5");
        System.out.println("(2). 2");
        System.out.println("(3). 4");
        System.out.println("(4). 20");
        resp = input.nextInt();
        switch(resp){
            case 1:
                System.out.println("Resposta correta!");
                pontos++;
                break;
            case 2:
                System.out.println("Resposta errada :(");
                break;
            case 3:
                System.out.println("Resposta errada :(");
                break;
            case 4:
                System.out.println("Resposta errada :(");
                break;
            default:
                System.out.println("Digite uma resposta de verdade >:(");
                break;
        }
        System.out.println("--- PERGUNTA N°2 ---");
        System.out.println("Quanto é 18 * 9?");
        System.out.println("(1). 172");
        System.out.println("(2). 180");
        System.out.println("(3). 162");
        System.out.println("(4). 18");
        resp = input.nextInt();
        switch(resp){
            case 1:
                System.out.println("Resposta errada :(");
                break;
            case 2:
                System.out.println("Resposta errada :(");
                break;
            case 3:
                System.out.println("Resposta correta!");
                pontos++;
                break;
            case 4:
                System.out.println("Resposta errada :(");
                break;
            default:
                System.out.println("Digite uma resposta de verdade >:(");
                break;
        }
        System.out.println("--- PERGUNTA N°3 ---");
        System.out.println("Qual o valor de x? (4x - 8 = 0)");
        System.out.println("(1). 6");
        System.out.println("(2). 2");
        System.out.println("(3). 10");
        System.out.println("(4). 8");
        resp = input.nextInt();
        switch(resp){
            case 1:
                System.out.println("Resposta errada :(");
                break;
            case 2:
                System.out.println("Resposta correta!");
                pontos++;
                break;
            case 3:
                System.out.println("Resposta errada :(");
                break;
            case 4:
                System.out.println("Resposta errada :(");
                break;
            default:
                System.out.println("Digite uma resposta de verdade >:(");
                break;
        }
        System.out.println("--- PERGUNTA N°4 ---");
        System.out.println("Quantos lados tem um hexágono?");
        System.out.println("(1). 6");
        System.out.println("(2). 8");
        System.out.println("(3). 7");
        System.out.println("(4). 10");
        resp = input.nextInt();
        switch(resp){
            case 1:
                System.out.println("Resposta correta!");
                pontos++;
                break;
            case 2:
                System.out.println("Resposta errada :(");
                break;
            case 3:
                System.out.println("Resposta errada :(");
                break;
            case 4:
                System.out.println("Resposta errada :(");
                break;
            default:
                System.out.println("Digite uma resposta de verdade >:(");
                break;
        }
        System.out.println("Total de pontos: "+pontos+"/4");
    }
}
