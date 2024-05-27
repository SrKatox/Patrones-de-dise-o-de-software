package Bridge;

public class Main {

    public static void main(String[] args) {
        Forma circuloRojo = new Circulo(new Rojo());
        Forma cuadradoAzul = new Cuadrado(new Azul());

        circuloRojo.aplicarColor();
        cuadradoAzul.aplicarColor();
    }
    
}
