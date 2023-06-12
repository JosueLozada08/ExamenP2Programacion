import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Menu {
    private ArrayList<Plato> platos;
    public Menu() {
        platos = new ArrayList<>();
    }

    public boolean registroPlato (String nombre, double precio, int calorias, int tiempoPreparacion) {
        for (Plato emp : platos) {
            if (emp.getNombre().equals(nombre)) {
                return false;
            }
        }
        Plato plato = new Plato(nombre, precio, calorias, tiempoPreparacion);
        platos.add(plato);
        return true;
    }

    public Plato modificar (String nombre, double precio, int calorias, int tiempoPreparacion) {
        for (Plato emp : platos) {
            if (emp.getNombre().equals(nombre)) {
                emp.setPrecio(precio);
                emp.setCalorias(calorias);
                emp.setTiempoPreparacion(tiempoPreparacion);

                return emp;
            }
        }
        return null;
    }
}
