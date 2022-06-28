package teste3;


import java.util.Arrays;

public class Vetor {

    public static void main(String[] args) {


        /* Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que
    desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.*/

        double[] faturamento = {31490.7866, 37277.9400, 37708.4303, 0, 0, 17394.2269, 0, 6925.1262, 24390.9374, 14279.6481, 0, 0,
                39807.6622, 27261.6304, 39775.6434, 29797.6232, 17216.5017, 0, 0, 12974.2, 28490.9861, 8748.0937, 8889.0023, 17767.5583,
                0, 0, 3071.3283, 48275.2994, 10299.6761, 39874.1073};


        System.out.println("Dados os Faturamentos:");

        for (int i = 0; i < faturamento.length ; i++) {

            System.out.println("Dia " + (i+1) + ": " + faturamento[i]);

        }

        double menorFaturamento, maiorFaturamento, mediaFaturamentos, totalFaturamentos;
        int dias;


        maiorFaturamento = Calculos.calculaMaiorValor(faturamento);
        menorFaturamento = Calculos.calculaMenorValor(faturamento, maiorFaturamento);
        totalFaturamentos = Calculos.totalFaturamento(faturamento);
        mediaFaturamentos = Calculos.mediaFaturamentos(faturamento, totalFaturamentos);
        dias = Calculos.contaDias(faturamento, mediaFaturamentos);

        System.out.println("==============================================================================");
        System.out.println("Menor valor de faturamento ocorrido em um dia do mês:" + menorFaturamento);
        System.out.println("Maior valor de faturamento ocorrido em um dia do mês:" + maiorFaturamento);
        System.out.println("Numero de dias do mês que o valor do faturamento foi superior à média mensal:"
                + dias);


    }


}




