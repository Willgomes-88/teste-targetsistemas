package teste3;

public class Calculos {
    public static double calculaMaiorValor(double[] faturamento) {
        double maiorValor = 0;


        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > maiorValor) {
                maiorValor = faturamento[i];
            }
        }
        return maiorValor;


    }

    public static double calculaMenorValor(double[] faturamento, double menorValor) {

        for (int i = 0; i < faturamento.length; i++) {

            if ((faturamento[i] < menorValor) && (faturamento[i] != 0)) {
                menorValor = faturamento[i];
            }
        }
        return menorValor;

    }

    public static double totalFaturamento(double[] faturamento) {
        double totalFatur = 0;
        for (int i = 0; i < faturamento.length; i++) {


            totalFatur += faturamento[i];

        }
        return totalFatur;

    }


    public static double mediaFaturamentos(double[] faturamento, double totalFaturamento) {

        double mediaFatur = totalFaturamento / faturamento.length;
        return mediaFatur;
    }

    public static int contaDias(double[] faturamento, double mediaFatur) {
        int contador = 0;

        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > mediaFatur) {
                contador++;
            }

        }

        return contador;
    }


}
