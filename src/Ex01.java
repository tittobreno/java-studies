import java.util.Scanner;

public class Ex01 {
    // 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
    public static void main(String[] args) {
        int a;
        int b;

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = reader.nextInt();

        System.out.println("Digite o segundo número: ");
        b = reader.nextInt();

        System.out.println("A soma é: " + (a + b));
    };
};