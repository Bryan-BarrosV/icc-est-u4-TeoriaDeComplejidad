package complejidades;

public class ComplejidadLogaritmica {
    public int busquedaBinaria(int[] arr, int x) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                inicio = mid + 1;
            } else {
                fin = mid - 1;
            }
        }
        return -1;
    }
}
