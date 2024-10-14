package SomaDeNumerosPrimos; // Pacote da classe

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class VerificaSeEPrimoOuNao {
    private static int NumeroASerTestado; // Variável que armazenará o número a ser testado

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria uma nova instância de Scanner para leitura de dados
        System.out.println ("Digite um número para ser verificado: "); // Solicita ao usuário que insira um número
        setNumeroASerTestado (scanner.nextInt()); // Lê o número digitado pelo usuário

        // Verifica se o número é menor que 2, já que números menores que 2 não são primos
        if (getNumeroASerTestado () < 2) {
            System.out.println("O número " + getNumeroASerTestado () + " não é primo"); // Informa que não é primo
            return; // Encerra o programa se o número não for primo
        }

        boolean isPrimo = true; // Inicializa a variável isPrimo como verdadeira
        int i = 2; // Começa a verificação de divisores a partir do número 2

        // Laço para verificar se o número é divisível por algum número entre 2 e metade do número testado
        while (i <= getNumeroASerTestado () / 2) {
            if (getNumeroASerTestado () % i == 0) { // Se o número for divisível por i
                isPrimo = false; // O número não é primo
                break; // Sai do loop se encontrar um divisor
            }
            i++; // Incrementa i para testar o próximo número
        }

        // Exibe o resultado da verificação
        if (isPrimo) {
            System.out.println ("O número " + getNumeroASerTestado () + " é primo"); // Informa que o número é primo
        } else {
            System.out.println ("O número " + getNumeroASerTestado () + " não é primo"); // Informa que o número não é primo
        }

        scanner.close(); // Fecha o scanner para liberar os recursos
    }

    public static int getNumeroASerTestado () {
        return NumeroASerTestado;
    }

    public static void setNumeroASerTestado (int numeroASerTestado) {
        NumeroASerTestado = numeroASerTestado;
    }
}

// BY: Cauã De Martin ;)
