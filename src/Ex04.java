import java.util.Scanner;

// Escreva um algoritmo que leia o nome de um vendedor,o seu salário fixo e o total de vendas
//  efetuadas por ele no mês(em dinheiro).Sabendo que este vendedor ganha 15%de comissão sobre suas
//   vendas efetuadas,informar o seu nome,o salário fixo e salário no final do mês;

public class Ex04 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String name;
        double salary;
        int salesAmount;

        System.out.println("Digite o nome do vendedor: ");
        name = reader.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        salary = reader.nextDouble();

        System.out.println("Digite o total de vendas do vendedor: ");
        salesAmount = reader.nextInt();

        reader.close();

        double comission = salesAmount * 0.15;
        double salaryWithComission = salary + comission;

        System.out.println("Salário do fixo do vendedor " + name + " é: " + salary);
        System.out.println("Comissão: " + comission);
        System.out.println("Salário com comissão: " + salaryWithComission);
    }

}
