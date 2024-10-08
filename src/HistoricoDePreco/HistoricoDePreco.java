package HistoricoDePreco;

import java.util.ArrayList;
import java.util.List;

public class HistoricoDePreco {

    private List<Double> precos = new ArrayList<>();

    public void registrarPreco(double preco) {
        precos.add(preco);
    }

    public double obterMaiorPreco() {
        validarPrecos();
        double maiorPreco = precos.get(0);
        for (double preco : precos) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        return maiorPreco;
    }

    public double obterMenorPreco() {
        validarPrecos();
        double menorPreco = precos.get(0);
        for (double preco : precos) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        return menorPreco;
    }

    private void validarPrecos() {
        if (precos.isEmpty()) {
            throw new IllegalStateException("Nenhum preço registrado");
        }
    }
}
