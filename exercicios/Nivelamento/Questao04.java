package exercicios.Nivelamento;

public class Questao04 {
    public static void main(String[] args) {
        String entrada = Questao02.readLine();
        int colunas = getColunas(entrada);
        char[][] matriz = new char[colunas][5];

        populateMatriz(colunas, matriz, entrada);
        printMatriz(colunas, matriz);

    }

    public static void printMatriz(int colunas, char[][] matriz) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.print("*");
        }
    }

    public static void populateMatriz(int colunas, char[][] matriz, String entrada) {
        int posicao = 0;
        for(int i = 0; i < colunas; i++) {
            for(int j = 0; j < 5; j++) {
                matriz[i][j] = getChar(entrada, posicao);
                posicao++;
            }
        }
    }

    public static int getColunas(String entrada) {
        int colunas;
        if(entrada.length() % 5 == 0) {
            colunas = entrada.length()/5;
        } else {
            colunas = entrada.length()/5+1;
        }
        return colunas;
    }

    public static char getChar(String entrada, int i) {
        try {
           return entrada.charAt(i);
        }catch (Exception e) {
            return ' ';
        }
    }
}
