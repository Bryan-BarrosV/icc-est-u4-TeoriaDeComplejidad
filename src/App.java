import complejidades.*;

public class App {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2, 9};
        int[] arr2 = {5, 3, 8, 1, 2, 9};
        int[] arr3 = {5, 3, 8, 1, 2, 9};

        // O(1) 
        System.out.println("=== O(1) ===");
        ComplejidadConstante c1 = new ComplejidadConstante();
        System.out.println("Primer elemento: " + c1.obtenerPrimero(arr));
        c1.asignar();

        // O(n) 
        System.out.println("\n=== O(n) ===");
        ComplejidadLineal c2 = new ComplejidadLineal();
        c2.metodoLineal(5);

        // O(log n) 
        System.out.println("\n=== O(log n) ===");
        ComplejidadLogaritmica c3 = new ComplejidadLogaritmica();
        int posicion = c3.busquedaBinaria(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 6);
        System.out.println("Posición buscada: " + posicion);

        // O(n²)
        System.out.println("\n=== O(n²) ===");
        ComplejidadCuadratica c4 = new ComplejidadCuadratica();

        c4.sortBubble(arr);
        System.out.println("Bubble Sort: ");
        imprimir(arr);

        c4.sortInsertion(arr2);
        System.out.println("Insertion Sort: ");
        imprimir(arr2);

        c4.sortSelection(arr3);
        System.out.println("Selection Sort: ");
        imprimir(arr3);
    }

    public static void imprimir(int[] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
