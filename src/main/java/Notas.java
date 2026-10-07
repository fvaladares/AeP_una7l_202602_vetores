import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 5; // tamanho do vetor
        int[] notas; // *Declaração* do vetor
        notas = new int[n]; // Inicialização do vetor
        double media = 0;
        int maiorNota;
        int menorNota;
        int acumuladorDeNotas = 0;

        System.out.println(".:Sistema de notas:.");

        // Estrutura de repetição usada para preencher o vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.print("\nInforme a nota " +
                    (i + 1) + ": ");
            notas[i] = entrada.nextInt();
            if (notas[i] <= 0 || notas[i] >= 20) {
                System.out.println("A nota deve estar entre 0 e 20 pontos;");
                i--;
            }
        }

        System.out.println();

        // Estrutura de repetição usada para percorrer o vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nNota %d: %d", (i + 1), notas[i]);
        }
        System.out.println();

        // Estrutura de repetição utilizada para
        // acumular os valores das notas
        for (int i = 0; i < notas.length; i++) {
            acumuladorDeNotas = acumuladorDeNotas + notas[i]; //media += notas[i];
        }
        // Calculando a média das notas;
        media = media / notas.length;

        System.out.printf("Média das notas: %.2f\n", media);

        System.out.println("Notas acima da média: ");
        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i];
            if (nota > media) {
                System.out.print(nota + ", ");
            }
        }

        System.out.println("\nNotas abaixo da média: ");
        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i];
            if (nota < media) {
                System.out.print(nota + ", ");
            }
        }

        maiorNota = menorNota = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maiorNota)
                maiorNota = notas[i];
            else if (notas[i] < menorNota)
                menorNota = notas[i];
        }

        System.out.println();
        System.out.printf("Maior nota: %d\n", maiorNota);
        System.out.printf("Menor nota: %d", menorNota);
        System.out.println();
    }
}
