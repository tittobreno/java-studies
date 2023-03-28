import java.util.Scanner;

public class Ex02 {
    // 2. Faça um algoritmo que receba dois números e ao final mostre a soma,
    // subtração, multiplicação e a divisão dos dois números lidos;
    public static void main(String[] args) {
        int a;
        int b;

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = reader.nextInt();

        System.out.println("Digite o segundo número: ");
        b = reader.nextInt();

        reader.close();

        System.out.println("O Resultado da adição entre " + a + " e " + b + " é: " + (a + b));
        System.out.println("O Resultado da subtração entre " + a + " e " + b + " é: " + (a - b));
        System.out.println("O Resultado da multiplicação entre " + a + " e " + b + " é: " + (a * b));
        System.out.println("O Resultado da divisão entre " + a + " e " + b + " é: " + (a / b));

    }
}