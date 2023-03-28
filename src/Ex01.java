import java.util.Scanner;

// 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

public class Ex01 {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = reader.nextInt();

        System.out.println("Digite o segundo número: ");
        b = reader.nextInt();

        reader.close();

        System.out.println("A soma é: " + (a + b));
    };
};