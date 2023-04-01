import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a;
        int b;
        int temporary;

        System.out.println("Digite o número de A: ");
        a = reader.nextInt();

        System.out.println("Digite o número de B: ");
        b = reader.nextInt();

        reader.close();

        temporary = b;
        b = a;
        a = temporary;

        System.out.println("Valor de A = " + a);
        System.out.println("Valor de B = " + b);

    }

}
