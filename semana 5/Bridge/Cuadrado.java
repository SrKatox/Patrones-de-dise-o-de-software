package Bridge;

public class Cuadrado extends Forma {
    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void aplicarColor() {
        System.out.print("Cuadrado relleno con color: ");
        color.aplicarColor();
    }
}
