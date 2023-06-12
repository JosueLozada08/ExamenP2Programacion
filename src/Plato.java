public class Plato {
private String nombre;
private double precio;
private int calorias;
private int TiempoPreparacion;

    public Plato(String nombre, double precio, int calorias, int tiempoPreparacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        TiempoPreparacion = tiempoPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getTiempoPreparacion() {
        return TiempoPreparacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        TiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", calorias=" + calorias +
                ", TiempoPreparacion=" + TiempoPreparacion +
                '}';
    }

}
