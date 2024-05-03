package EjercicioMochila;
import java.util.Random;

public class Objeto{
    private String nombre;
    private String forma;
    private double peso;
    private double precio;
    
    public Objeto(){
        this.nombre = generarNombre();
        this.forma = generarForma();
        this.peso = generarNumero(1,12);
        this.precio = generarNumero(10,80);
    }
    
    private String generarNombre() {
        String[] nombres = {"zapatos","Gorra", "Botella","Polo","Corrector","Casaca","Pantalon","Toalla","Cargador"};
        Random rand = new Random();
        return nombres[rand.nextInt(nombres.length)];
    }
    
    private String generarForma() {
        String[] nombres = {"Cuadrado", "Rectangulo", "Cilindrica","Circular"};
        Random rand = new Random();
        return nombres[rand.nextInt(nombres.length)];
    }
    
    private double generarNumero(double min, double max) {
        Random rand = new Random();
        double randomNumber = min + (max - min) * rand.nextDouble();
        return Math.round(randomNumber * 100.0) / 100.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getForma() {
        return forma;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }
}
