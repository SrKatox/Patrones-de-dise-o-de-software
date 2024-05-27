package Composite;

public class Main {

    public static void main(String[] args) {
        Grafico circulo1 = new Circulo();
        Grafico circulo2 = new Circulo();
        Grafico rectangulo1 = new Rectangulo();

        ComposicionGrafica composicion1 = new ComposicionGrafica();
        composicion1.agregar(circulo1);
        composicion1.agregar(rectangulo1);

        ComposicionGrafica composicion2 = new ComposicionGrafica();
        composicion2.agregar(composicion1);
        composicion2.agregar(circulo2);

        composicion2.dibujar();
    }
    
}
