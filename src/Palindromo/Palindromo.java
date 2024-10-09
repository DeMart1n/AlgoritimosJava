package Palindromo;

public class Palindromo {

    public boolean eUmPalindromo (String fraseInicial) {
        String fraseLimpa = limparFrase (fraseInicial);
        String fraseInvertida = new StringBuilder (fraseLimpa).reverse ().toString ();
        return fraseLimpa.equals (fraseInvertida);
    }

    public String limparFrase (String fraseInicial) {
        String fraseLimpa = fraseInicial;
        fraseLimpa = fraseLimpa.replaceAll (" ", "");
        return fraseLimpa;
    }

    private String limparFrase () {
        return limparFrase ().replaceAll ("[^a-zA-Z]", "").toLowerCase ();
    }
}

