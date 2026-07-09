import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {

        //Exercício 1

        //Prrencher vetor

        System.out.println("\nDigite o tamanho do vetor.");
        Scanner sc = new Scanner(System.in);

        int tamanhodoVetor = sc.nextInt();
        int vetorDoUsuario[] = new int[tamanhodoVetor];

        for(int i=0; i < tamanhodoVetor; i++) {

            System.out.println("Digite o valor da posição "+ i + " do seu vetor: ");
            vetorDoUsuario[i] = sc.nextInt();
        }

        System.out.println("\nVeja os valores do vetor");
        for (int i=0; i < vetorDoUsuario.length; i++) {
            System.out.println(vetorDoUsuario[i]);
        }

        //Ordenar vetor

        System.out.println("\nVeja os valores do vetor em ordem crescente");
        for (int i=0; i < vetorDoUsuario.length; i++) {
            for (int j = i; j < vetorDoUsuario.length; j++) {
                if(vetorDoUsuario[j] < vetorDoUsuario[i]) {
                    int aux = vetorDoUsuario[i];
                    vetorDoUsuario[i] = vetorDoUsuario [j];
                    vetorDoUsuario[j] = aux;
                }
            }
            System.out.println(vetorDoUsuario[i]);
        }

        //Quantidade de vogais

        sc.nextLine();

        System.out.println("\nDigite um nome");
        String nome = sc.nextLine();

        int contador = 0;
        char[] letras = nome.toLowerCase().toCharArray();

        for (char letra : letras) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);

        //Exercício 2

        System.out.println("\nDigite o tamanho do vetor.");

        int tamanhodoVetor2 = sc.nextInt();
        int vetorDoUsuario2[] = new int[tamanhodoVetor2];

        for(int i=0; i < tamanhodoVetor2; i++) {

            System.out.println("Digite o valor da posição "+ i + " do seu vetor: ");
            vetorDoUsuario2[i] = sc.nextInt();
        }

        System.out.println("\nVeja os valores do vetor");
        for (int i=0; i < vetorDoUsuario2.length; i++) {
            System.out.println(vetorDoUsuario2[i]);
        }

        System.out.println("\nVeja os valores do novo Vetor");

        for (int i = 0; i < vetorDoUsuario2.length; i++) {
            if (vetorDoUsuario2[i] % 2 == 0) {
                vetorDoUsuario2[i] = vetorDoUsuario2[i] * 2;
            } else {
                vetorDoUsuario2[i] = (int) Math.pow(vetorDoUsuario2[i], 2);
            }
        }

        for (int i = 0; i < vetorDoUsuario2.length; i++) {
            System.out.println(vetorDoUsuario2[i]);
        }

        //Exercício 3

        System.out.println("\nDigite um nome:");
        sc.nextLine();
        String nome2 = sc.nextLine();

        char[] letras2 = nome2.toCharArray();

        System.out.println("\nNome invertido");

        for (int i = letras2.length -1; i >= 0; i--) {
            System.out.print(letras2[i]);
        }
        sc.close();
    
    }

}
