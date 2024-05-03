package EjercicioMochila;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class NewMain {

    public static void main(String[] args) {
       List<Objeto> listaObjetos = GenerarObjetos(20);
       Scanner scanner=new Scanner(System.in);
       
       System.out.println("Ingrese el limite de peso");
       int limite =scanner.nextInt();
       
       mostrarObjetos(listaObjetos);
       maximizacion(listaObjetos, limite);
    }
    
    private static List<Objeto> GenerarObjetos(int cantidad){
        List<Objeto> objetos = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            objetos.add(new Objeto());
        }
        return objetos;
    }
    
    private static void mostrarObjetos(List<Objeto> objetos) {
        System.out.println("------------------------------");
        for (int i = 0; i < objetos.size(); i++) {
            Objeto objeto = objetos.get(i);
            System.out.println((i + 1) + ". " + objeto.getNombre() + " - Forma: " + objeto.getForma() + ", Peso: " + objeto.getPeso() + ", Precio: " + objeto.getPrecio());
        }
        System.out.println("------------------------------");
    }
    
    private static List<Objeto> maximizacion(List<Objeto> objetos, double limite) {
        Mochila mochila = new Mochila();
        List<Objeto> listaObjetosMax = new ArrayList<>();
        double valorTotal = 0.0;
        double pesoTotal = 0.0;

        objetos.sort((objeto1, objeto2) -> Double.compare(objeto2.getPrecio() / objeto1.getPeso(), objeto1.getPrecio() / objeto2.getPeso()));

        for (Objeto objeto : objetos) {
            if (mochila.getPeso() + objeto.getPeso() <= limite) {
                listaObjetosMax.add(objeto);
                mochila.setPeso((double)(mochila.getPeso() + objeto.getPeso()));
                valorTotal += objeto.getPrecio();
            } else {
                break;
            }
        }
                
        System.out.println("\nObjetos seleccionados maximizando el peso de la mochila:");
        for (Objeto objeto : listaObjetosMax) {
            System.out.println("Nombre: " + objeto.getNombre() +", Peso: " + objeto.getPeso()+", Precio: " + objeto.getPrecio());
            pesoTotal += objeto.getPeso();
        }
        System.out.println("\nValor total: " + (valorTotal*100.0)/100.0);
        System.out.println("Peso total: " + (pesoTotal*100.0)/100.0);

        return listaObjetosMax;
    }
}
