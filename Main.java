import java.util.Scanner;
public class Main{

    public static void main(String[] args) {

        System.out.println("Bem vindo!!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome completo?");
        String nome = scanner.nextLine();

        System.out.println("Qual seu CPF?");
        String cpf = scanner.nextLine();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura?");
        float altura = scanner.nextFloat();

        System.out.println("Qual seu peso?");
        float peso = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Qual seu estado civil?");
        String estadoCivil = scanner.nextLine();

        scanner.close();

    }
}
