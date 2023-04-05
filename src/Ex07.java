import java.util.Scanner;

// Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e 
// C a temperatura emCelsius;
public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();

        scan.close();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
