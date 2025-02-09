package Nivelamento;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Questao02 {

    public static void main(String[] args) {
        menuProgram();
    }

    private static void menuProgram() {
        printMenu();
        int opcode = Questao01.readNumber();
        System.out.println("===================================");
        switch (opcode) {
            case 1:
                sumTwoNumbers();
                menuProgram();
            case 2:
                greatherThan();
                menuProgram();
            case 3:
                sumNNumbers();
                menuProgram();
            case 4:
                pairNumbers();
                menuProgram();
            case 0:
                System.exit(0);
            default:
                System.out.println("Opção Invalida");
                menuProgram();
        }
    }

    private static void pairNumbers() {
        System.out.println("Digite uma sequência de numeros separados por espaço: ");
        String sequencia = readLine();
        String[] numeros = sequencia.split(" ");
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            int number = numberTransform(numeros[i]);
            numeros[i] = String.valueOf(number);
            if (number % 2 == 0) {
                contador++;
            }
        }
        printSequence(numeros);
        System.out.println();
        System.out.println("Essa sequência tem: " + contador + " números pares");
    }

    private static void printSequence(String[] numeros) {
        for (String numero : numeros) {
            System.out.print(numero);
            System.out.print(" ");
        }
    }

    private static int numberTransform(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (Exception ex) {
            System.out.println("Número: " + numero + " invalido, digite novamente");
            return Questao01.readNumber();
        }
    }

    private static void sumNNumbers() {
        System.out.println("Quantidade de números a serem somados: ");
        int qnt = Questao01.readNumber();
        System.out.println("Digite o primeiro numero: ");
        int auxiliar = 0;
        for (int i = 0; i < qnt; i++) {
            auxiliar = auxiliar + Questao01.readNumber();
            System.out.println("[" + (i + 2) + "] Qual valor deve ser somado: ");
        }
        System.out.println("O resultado da soma dos números é: " + auxiliar);
    }

    private static void greatherThan() {
        System.out.println("Digite o primeiro número: ");
        int num1 = Questao01.readNumber();
        System.out.println("Digite o segundo número: ");
        int num2 = Questao01.readNumber();
        if (num1 >= num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }

    private static void sumTwoNumbers() {
        System.out.println("Digite o primeiro número: ");
        int num1 = Questao01.readNumber();
        System.out.println("Digite o segundo número: ");
        int num2 = Questao01.readNumber();
        System.out.println("Resultado: " + (num1 + num2));
    }

    private static void printMenu() {
        System.out.println("===================================");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - O maior de dois números");
        System.out.println("3 - Somar N números");
        System.out.println("4 - Contador de pares de uma sequência");
        System.out.println("0 - Sair");
        System.out.println("===================================");
        System.out.println("Opção: ");
    }

    public static String readLine() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            return br.readLine();
        } catch (Exception ex) {
            System.out.println("Números invalidos, digite novamente");
            return readLine();
        }
    }
}

