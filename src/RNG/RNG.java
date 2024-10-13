package RNG;

import java.util.Random; // Importa a classe Random para gerar números aleatórios

public class RNG {
    public static void main(String[] args) {
        Random random = new Random(); // Cria uma nova instância de Random

        // Gera 10 números aleatórios entre 1 e 100
        for (int i = 0; i < 10; i++) {
            // Gera um número aleatório entre 1 e 100
            int randomNumber = random.nextInt(100) + 1; // nextInt(100) gera entre 0 e 99, por isso somamos 1

            // Imprime o número aleatório gerado
            System.out.println("Número aleatório " + (i + 1) + ": " + randomNumber);
        }
    }
}

// BY: Cauã De Martin ;)
