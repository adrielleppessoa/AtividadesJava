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
        


    }

}
