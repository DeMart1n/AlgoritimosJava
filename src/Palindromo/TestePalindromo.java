package Palindromo;
import java.util.Scanner;

public class TestePalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase para verificar a existência de um palíndromo: ");
        String frase = sc.nextLine();

        Palindromo palindromoChecker = new Palindromo();

        boolean resultado = palindromoChecker.eUmPalindromo(frase);
        if (resultado) {
            System.out.println("Palíndromo encontrado com sucesso!");
        } else {
            System.out.println("Nenhum palíndromo encontrado.");
        }
        sc.close();
    }
}
