package ContadorDePalavras; // Pacote da classe

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class ContadorDePalavras {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in); // Cria um Scanner para leitura da entrada do usuário
        System.out.println ("Digite uma frase: "); // Exibe uma mensagem solicitando uma frase
        String frase = entrada.nextLine(); // Lê a frase digitada pelo usuário

        String[] palavras = frase.split(" "); // Divide a frase em palavras com base nos espaços
        int quantidadeDePalavras = palavras.length; // Calcula a quantidade de palavras
        System.out.println ("A frase possui " + quantidadeDePalavras + " palavras."); // Exibe o número de palavras

        // Fechando o scanner para evitar vazamento de recursos
        entrada.close();
    }
}

// BY: Cauã De Martin ;)

