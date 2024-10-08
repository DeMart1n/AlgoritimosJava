package HistoricoDePreco;

import java.util.ArrayList;
import java.util.List;

public class HistoricoDePreco {

    private List<Double> precos;

    // Inicializando a lista de preços
    public HistoricoDePreco() {
        this.precos = new ArrayList<>();
    }

    // Adiciona o preço à lista de preços
    public void registrarPreco(double preco) {
        precos.add(preco);
    }

    // Retorna o maior preço registrado
    public double obterOMaiorPreco() {
        if (precos.isEmpty()) {
            throw new IllegalStateException("Nenhum preço foi registrado");
        }

        // Inicializa o maior preço com o primeiro da lista
        double maiorPreco = precos.get(0);

        // Percorre a lista e encontra o maior valor
        for (double preco : precos) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        return maiorPreco;
    }

    // Retorna o menor preço registrado
    public double obterOMenorPreco() {
        if (precos.isEmpty()) {
            throw new IllegalStateException("Nenhum preço foi registrado");
        }

        // Inicializa o menor preço com o primeiro da lista
        double menorPreco = precos.get(0);

        // Percorre a lista e encontra o menor valor
        for (double preco : precos) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        return menorPreco;
    }

}
