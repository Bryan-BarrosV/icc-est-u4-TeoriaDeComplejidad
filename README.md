
# **INFORME DE INVESTIGACION**


![LOGO CARRERA](src/assets/ups-icc.png)


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Nombre Completo 1 - Enlace a GitHub
- Nombre Completo 1 - Enlace a GitHub

# Objetivos:

Colocar aquí los objetivos del trabajo.


# Marco Teórico: 

Colocar aquí el marco teórico del trabajo, los conceptos y definiciones relevantes.

## **1. Teoría de la Complejidad**

*(Aquí el estudiante coloca su investigación)*

### 1.1 Definición general

### 1.2 Importancia en la resolución de problemas

### 1.3 Eficiencia de algoritmos

* Coste temporal
* Coste espacial

### 1.4 Factores de tiempo de ejecución

* Factores propios
* Factores circunstanciales
* Análisis teórico
* Análisis experimental

### 1.5 Notación de complejidad

* Big O
* Mejor caso
* Peor caso
* Caso promedio
* Big O, Ω, Θ

---
## **2. Ejemplos de Complejidad en Java
** En esta sección se presentan las clases creadas dentro del proyecto y el análisis correspondiente a cada una. 
---
 ## **2.1 Complejidad O(1) – Constante** 
 ### **Archivo:** ComplejidadConstante.java 
 ### **Código del ejemplo**
```java

    public int obtenerPrimero(int[] arr){ 
        return arr[0];
    }

    public void asignar(){ 
        int x = 10;
        System.out.println("x asignado = " + x);
    }
```
## **2.2 Complejidad O(log n) – Logaritmica** 
### **Archivo:** ComplejidadLogaritmica.java 
### **Código del ejemplo**
```java
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
```
## **2.3 Complejidad O(n) – Lineal** 
### **Archivo:** ComplejidadLineal.java 
### **Código del ejemplo**

```java
public class ComplejidadLineal {
    public void metodoLineal(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Iteración número: " + i);
        }
    }
}
```

## **2.4 Complejidad O(n log n) – Lineal-Logaritmica** 
### **Archivo:** ComplejidadLogaritmica.java 
### **Código del ejemplo**

```java
public class ComplejidadNLogN {
     public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }


    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    ```
## **2.5 Complejidad O(n²) – Cuadratica**

 ### **Archivo:** ComplejidadCuadratica.java 

 ### **Código del ejemplo**
```java
public class ComplejidadCuadratica {
    public void sortBubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void sortInsertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void sortSelection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
```


### **Explicación resumida**

*(Aquí el estudiante explica por qué es O(1))*

---
**PARA CADA COMPLEJIDAD, REPETIR LA ESTRUCTURA ANTERIOR**


# **Conclusiones**

*(Aquí el estudiante agrega conclusiones propias del trabajo)*

**POR ESTUDIANTE**: *(Nombre completo del estudiante)*

---

