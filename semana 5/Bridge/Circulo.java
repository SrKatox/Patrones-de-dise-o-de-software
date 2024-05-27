package Bridge;

public class Circulo extends Forma {
    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void aplicarColor() {
        System.out.print("Círculo relleno con color: ");
        color.aplicarColor();
    }
}
