package teste4;

public class Distribuidora {

    public static void main(String[] args) {
        /*  Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53
Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do
valor total mensal da distribuidora.
 */


        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
        double faturamentos[] = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        double totalFatur = 0, percentual;

//Total de Faturamento

        for (int i = 0; i < faturamentos.length; i++) {
            totalFatur += faturamentos[i];


        }

//Percentual de Representação de cada estado


        for (int i = 0; i < faturamentos.length - 1; i++) {

            percentual = (faturamentos[i] / totalFatur) *100;

            System.out.println("Percentual de Representação do Estado " + estados[i] + ": " + String.format("%.2f%%",percentual));

        }


    }
}
