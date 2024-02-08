package br.com.guicavaleiro;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        do{
            System.out.println("Digite a sua primeira nota: ");
            nota1 = scanner.nextDouble();
        } while (nota1 > 10 || nota1 < 0);

        do{
            System.out.println("Digite a sua segunda nota: ");
            nota2 = scanner.nextDouble();
        } while (nota2 > 10 || nota2 < 0);

        do{
            System.out.println("Digite a sua terceira nota: ");
            nota3 = scanner.nextDouble();
        } while (nota3 > 10 || nota3 < 0);

        do{
            System.out.println("Digite a sua quarta nota: ");
            nota4 = scanner.nextDouble();
        } while (nota4 > 10 || nota4 < 0);

        media = calculaMedia(nota1, nota4, nota3, nota4);

        System.out.println("A sua média foi de: " + media);
        if (media >= 7){
            System.out.println("Aluno aprovado!");
        } else if (media >= 5){
            System.out.println("Aluno em recuperação!");
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
    public static double calculaMedia(double n1,double n2,double n3,double n4){
        return (n1 +n2 + n3 + n4) / 4;
    }
}
