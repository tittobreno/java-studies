
import java.util.Scanner;
// Escreva um algoritmo para determinar o consumo médio de um automóvel sendo
// fornecida a distância total percorrida pelo automóvel e o total de
// combustível gasto;

public class Ex03 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double totalDistance = 0;
        double totalFuelSpent = 0;

        System.out.println("Digite a distancia total percorrida: ");
        totalDistance = reader.nextDouble();

        System.out.println("Digite o total de litros de combustivel gasto: ");
        totalFuelSpent = reader.nextDouble();

        reader.close();

        System.out.println("O consumo médio é: " + totalDistance / totalFuelSpent + " km/l");

    }

}
