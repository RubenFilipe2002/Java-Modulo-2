package ola2;

import java.util.Scanner;

public class Ola2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num1, num2;
        double notafinal;
        String nome;

        System.out.println("Nome do aluno:");
        nome = ler.next();
        System.out.println("Media dos testes");
        num1 = ler.nextInt();
        System.out.println("nota das atitudes");
        num2 = ler.nextInt();
        notafinal = (num1 * 0.6) + (num2 * 0.4);
        System.out.print("A media do aluno " + nome);
        System.out.print(" é:" + notafinal);

        if (notafinal > 10) {
            System.out.println("  Está Aprovado");
        } else {
            System.out.println("  Está Reprovado");
        }

    }

}