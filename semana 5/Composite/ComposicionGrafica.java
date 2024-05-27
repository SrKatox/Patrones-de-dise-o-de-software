package Composite;
import java.util.*;

public class ComposicionGrafica implements Grafico{
    private List<Grafico> graficos = new ArrayList<>();

    public void agregar(Grafico grafico) {
        graficos.add(grafico);
    }

    public void eliminar(Grafico grafico) {
        graficos.remove(grafico);
    }

    @Override
    public void dibujar() {
        for (Grafico grafico : graficos) {
            grafico.dibujar();
        }
    }
}
