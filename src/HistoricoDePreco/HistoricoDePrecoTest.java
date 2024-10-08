package HistoricoDePreco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HistoricoDePrecoTest {

    @Test
    public void testRegistrarPreco() {
        HistoricoDePreco historico = new HistoricoDePreco();
        historico.registrarPreco(10.0);
        assertEquals(10.0, historico.obterOMaiorPreco());
    }

    @Test
    public void testObterMaiorPreco() {
        HistoricoDePreco historico = new HistoricoDePreco();
        historico.registrarPreco(5.0);
        historico.registrarPreco(15.0);
        assertEquals(15.0, historico.obterOMaiorPreco());
    }

    @Test
    public void testObterMenorPreco() {
        HistoricoDePreco historico = new HistoricoDePreco();
        historico.registrarPreco(20.0);
        historico.registrarPreco(5.0);
        assertEquals(5.0, historico.obterOMenorPreco());
    }

    @Test
    public void testObterMaiorPrecoComListaVazia() {
        HistoricoDePreco historico = new HistoricoDePreco();
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            historico.obterOMaiorPreco();
        });
        assertEquals("Nenhum preço foi registrado", exception.getMessage());
    }

    @Test
    public void testObterMenorPrecoComListaVazia() {
        HistoricoDePreco historico = new HistoricoDePreco();
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            historico.obterOMenorPreco();
        });
        assertEquals("Nenhum preço foi registrado", exception.getMessage());
    }
}
