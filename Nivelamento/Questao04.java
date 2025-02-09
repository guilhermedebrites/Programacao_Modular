package Nivelamento;

public class Questao04 {
    public static void main(String[] args) {
        String entrada = Questao02.readLine();
        int colunas;
        if(entrada.length() % 5 == 0) {
            colunas = entrada.length()/5;
        } else {
            colunas = entrada.length()/5+1;
        }

        char[][] matriz = new char[colunas][5];

        int posicao = 0;
        for(int i = 0; i < colunas; i++) {
            for(int j = 0; j < 5; j++) {
                matriz[i][j] = entrada.charAt(posicao);
                posicao++;
            }
        }

        System.out.println(matriz);

    }

    private static void testes() {
        String entrada = Questao02.readLine();
        int linhas;
        if(entrada.length() % 5 == 0){
            linhas = entrada.length()/5;
        }else{
            linhas = entrada.length()/5+1;
        }

        int j = 0;
        for (int i = 0; i <= linhas; i++) {
            j = i;
            for (int k = 0; k < 4; k++) {
//                System.out.print(getAChar(entrada, j));
                j+=5;
            }
            System.out.print("*");
        }
    }

    private static char getChar(String entrada, int i) {
        try {
           return (char) entrada.charAt(i);
        }catch (Exception e) {
            return ' ';
        }
    }
}
