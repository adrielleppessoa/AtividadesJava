import java.util.scanner;

public class EstruturaRepeticao {

    public static void Main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número positivo para ver a tabuada");

        int numero = scanner.nextInt();
        int tabuada = 10;

        while (tentativa <= 10) {
             System.out.println(numero + " x " + tabuada + " = " + (numero * tabuada));
            tabuada++;

        }
        
        scanner.nextLine();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite uma palavra ou frase: ");
                    String texto = scanner.nextLine();
                    System.out.println("Você digitou: " + texto);
                    break;

                case 2:
                    System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 2);

        scanner.close();


    }

}
