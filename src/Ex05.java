import java.util.Scanner;

// Escreva um algoritmo que leia o nome de um aluno e as notas das três provas
//  que ele obteve no semestre. No finalinformar o nome do aluno e a sua média (aritmética);

public class Ex05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double[] notes = new double[3];
        String name;
        int sum = 0;

        System.out.println("Digite o nome do aluno: ");
        name = reader.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notes[i] = reader.nextInt();
        }

        reader.close();

        for (int i = 0; i < notes.length; i++) {
            sum += notes[i];
        }

        System.out.println("A média do aluno " + name + " é " + (sum / notes.length));
    }

}
