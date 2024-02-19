import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class Teste {
    @Test
    public void teste() {
        ListaFeminino listaFeminino = new ListaFeminino();
        ArrayList<String> retornoAtual = new ArrayList<>();
        retornoAtual = listaFeminino.filtrarLambda(listaFeminino.criarLista());
        ArrayList<String> retornoEsperado = new ArrayList<>();
        retornoEsperado.add("F");
        retornoEsperado.add("F");
        retornoEsperado.add("F");
        Assert.assertEquals(retornoAtual, retornoEsperado);
    }

}
