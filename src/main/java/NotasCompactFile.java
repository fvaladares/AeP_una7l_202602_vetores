import static java.lang.IO.*;

void main() {
    int n = 5; // tamanho do vetor
    int[] notas; // *Declaração* do vetor
    notas = new int[n]; // Inicialização do vetor
    double media = 0;
    int maiorNota;
    int menorNota;
    int acumuladorDeNotas = 0;

    println(".:Sistema de notas:.");


    // Estrutura de repetição usada para preencher o vetor
    for (int i = 0; i < notas.length; i++) {
        notas[i] = readInt(("\nInforme a nota " + (i + 1) + ": "));
        if (notas[i] < 0 || notas[i] > 20) {
            println("A nota deve estar entre 0 e 20 pontos;");
            i--;
        }
    }

    println();

    // Estrutura de repetição usada para percorrer o vetor
    for (int i = 0; i < notas.length; i++) {
        println(String.format("\nNota %d: %d", (i + 1), notas[i]));
    }
    println();

    // Estrutura de repetição utilizada para
    // acumular os valores das notas
    for (int i = 0; i < notas.length; i++) {
        acumuladorDeNotas = acumuladorDeNotas + notas[i]; //media += notas[i];
    }
    // Calculando a média das notas;
    media = media / notas.length;

    print(String.format("Média das notas: %.2f\n", media));

    println("Notas acima da média: ");
    for (int i = 0; i < notas.length; i++) {
        int nota = notas[i];
        if (nota > media) {
            System.out.print(nota + ", ");
        }
    }

    println("\nNotas abaixo da média: ");
    for (int i = 0; i < notas.length; i++) {
        int nota = notas[i];
        if (nota < media) {
            print(nota + ", ");
        }
    }

    maiorNota = menorNota = notas[0];

    for (int i = 1; i < notas.length; i++) {
        if (notas[i] > maiorNota)
            maiorNota = notas[i];
        else if (notas[i] < menorNota)
            menorNota = notas[i];
    }

    println();
    print(String.format("Maior nota: %d\n", maiorNota));
    print(String.format("Menor nota: %d", menorNota));
    println();
}

// Função para realizar a leitura e conversão de String em Inteiro.
public int readInt(String message) {
    return Integer.parseInt(message);
}