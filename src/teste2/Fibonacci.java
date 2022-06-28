package teste2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
        anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
        informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
        pertence ou não a sequência.*/


        int input, a = 1, b = 0, x;
        boolean test = false;

        System.out.println("Entre com o valor: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();


        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");

            x = a;
            a += b;
            b = x;

            if (input == a) {
                test = true;
            }
        }


        if (test == true) {

            System.out.println("\nA sequência contém o número digitado.");
        } else {
            System.out.println("\nA sequência não contém o número digitado");
        }


    }


}

