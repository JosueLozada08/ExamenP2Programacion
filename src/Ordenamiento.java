import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenamiento {
    int[] arreglo;
    int[] arregloBurbuja;
    int[] arregloInsercion;

    public void Burbuja(){
        arregloBurbuja = arreglo.clone();
        int n = arregloBurbuja.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arregloBurbuja[j] > arregloBurbuja[j+1]) {
                    int temp = arregloBurbuja[j];
                    arregloBurbuja[j] = arregloBurbuja[j+1];
                    arregloBurbuja[j+1] = temp;
                }
            }
        }
    }

    public void Insercion(){
        arregloInsercion = arreglo.clone();
        int n = arregloInsercion.length;
        for (int i = 1; i < n; ++i) {
            int key = arregloInsercion[i];
            int j = i - 1;

            while (j >= 0 && arregloInsercion[j] > key) {
                arregloInsercion[j + 1] = arregloInsercion[j];
                j = j - 1;
            }
            arregloInsercion[j + 1] = key;
        }
    }

    //Devolver el arregloBurbuja
    public int[] getArregloBurbuja() {
        return arregloBurbuja;
    }

    //Devoler el arregloInsercion
    public int[] getArregloInsercion() {
        return arregloInsercion;
    }

    public int[] getArreglo() {
        return arreglo;
    }
}
