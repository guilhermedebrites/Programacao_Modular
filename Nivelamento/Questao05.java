package Nivelamento;

import java.util.Arrays;

import static Nivelamento.Questao04.*;

public class Questao05 {

    public static void main(String[] args) {
        String entrada = Questao02.readLine();
        int colunas = getColunas(entrada);
        char[][] matriz = createMatriz(colunas);

        populateMatrizInvertida(colunas, matriz, entrada);

        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }

    private static char[][] createMatriz(int colunas) {
        char[][] matriz = new char[colunas][5];
        Arrays.stream(matriz).forEach(c -> Arrays.fill(c, ' '));
        return matriz;
    }


    public static void populateMatrizInvertida(int colunas, char[][] matriz, String entrada) {
        int posicao = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < colunas; j++) {
                if (entrada.charAt(posicao) == '*') {
                    j = colunas;
                } else {
                    matriz[j][i] = entrada.charAt(posicao);
                }
                posicao++;
            }
        }
    }


}
