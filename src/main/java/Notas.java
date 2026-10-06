import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 5; // tamanho do vetor
        int[] notas; // *Declaração* do vetor
        notas = new int[n]; // Inicialização do vetor

        System.out.println(".:Sistema de notas:.");

        // Estrutura de repetição usada para preencher o vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.print("\nInforme a nota " +
                    (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }

        System.out.println();

        // Estrutura de repetição usada para percorrer o vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nNota %d: %d", (i + 1), notas[i]);
        }
        System.out.println();
    }
}
