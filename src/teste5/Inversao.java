package teste5;

import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) {

        /*Escreva um programa que inverta os caracteres de um string.*/
        String entrada, saida="";


        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a palavra: ");
        entrada = scan.nextLine();

        for (int i = entrada.length() - 1; i>=0 ; i--) {

            saida+= entrada.charAt(i);

        }

        System.out.println("Sua palavra invertida: " + saida);



    }
}
