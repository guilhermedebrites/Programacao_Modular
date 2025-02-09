package Nivelamento;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Questao03 {
    public static void main(String[] args) {
        System.out.println("===================================");
        double[] exercicios = new double[4];
        double[] provas = new double[2];
        double[] trabalhos = new double[1];

        extrairNotas(4, "Digite a nota do Exercício ", exercicios, 100);
        System.out.println("===================================");
        extrairNotas(2, "Digite a nota da Prova ", provas, 100);
        System.out.println("===================================");
        extrairNotas(1, "Digite a nota do Trabalho ", trabalhos, 20);
        System.out.println("===================================");

        double notaExercicio = getSomaTotal(exercicios);
        double notaProva = getSomaTotal(provas);
        double notaTrabalho = getSomaTotal(trabalhos);

        double notaGeral = ((notaExercicio / 4) * 0.2) + ((notaProva / 2) * 0.6) + (notaTrabalho * 0.2);
        String resultado = String.format("%.2f", notaGeral);
        System.out.println("Resultado: " + resultado);

    }

    private static void extrairNotas(int x, String x1, double[] exercicios, int total) {
        for (int i = 0; i < x; i++) {
            System.out.println(x1 + (i + 1) + ":");
            exercicios[i] = validateNotes();
        }
    }

    private static double validateNotes() {
        double valor = readDouble();
        if (valor > 100 || valor < 0) {
            System.out.println("Nota inválidas!");
            return validateNotes();
        }
        return valor;
    }

    private static double getSomaTotal(double[] exercicios) {
        double somaTotal = 0;
        for (double exercicio : exercicios) {
            somaTotal += exercicio;
        }
        return somaTotal;
    }

    public static double readDouble() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            return Double.parseDouble(br.readLine());
        } catch (Exception ex) {
            System.out.println("Número invalido, digite novamente");
            return readDouble();
        }
    }
}
