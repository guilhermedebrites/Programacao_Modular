package Nivelamento;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Questao01 {
    public static void main(String[] args) {
        int largura = readNumber();
        int altura = readNumber();

        printCloseLines(largura);
        printEmptyLines(altura, largura);
        printCloseLines(largura);
    }

    private static void printEmptyLines(int altura, int largura) {
        for (int i = 0; i < altura -2; i++) {
            System.out.print("X");
            for (int j = 0; j < largura -2; j++) {
                System.out.print(" ");
            }
            System.out.print("X");
            System.out.println();
        }
    }

    private static void printCloseLines(int largura) {
        for (int i = 0; i < largura; i++) {
            System.out.print("X");
        }
        System.out.println();
    }

    public static int readNumber() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            return Integer.parseInt(br.readLine());
        } catch (Exception ex) {
            System.out.println("Número invalido, digite novamente");
            return readNumber();
        }
    }
}
