
# **INFORME DE INVESTIGACIÓN**


![LOGO CARRERA](src/assets/ups-icc.png)


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Bryan Stalyn Barros Villa - [https://github.com/Bryan-BarrosV](https://github.com/Bryan-BarrosV)
- Diana Valeria Borja Sarmiento - [https://github.com/DianitaB](https://github.com/DianitaB)

# Objetivos:

**Objetivo General**

Analizar y comparar la complejidad temporal y eficiencia de distintos algoritmos de ordenamiento y búsqueda mediante su implementación práctica

**Objetivos Específicos**
- Implementar algoritmos de ordenamiento y búsqueda en un lenguaje de programación (Java).
- Evaluar la complejidad computacional teórica (Big O) de cada algoritmo.
- Medir los tiempos de ejecución de cada algoritmo bajo diferentes tamaños de muestra 


# Marco Teórico: 
El estudio de los algoritmos y su eficiencia es fundamental dentro del área de la informática, ya que permite comprender cómo se comportan las soluciones computacionales frente a distintos tamaños de datos. Los algoritmos no solo deben resolver un problema correctamente, sino también hacerlo de la manera más óptima posible, considerando el tiempo y los recursos que utilizan. A continuación, se presentan los conceptos esenciales que fundamentan el análisis realizado en este proyecto.

## **1. Teoría de la Complejidad**


### 1.1 Definición general
La teoría de la complejidad es el estudio de recursos, principalmente el tiempo y la memoria. Es un campo central en la informática teórica y contribuye en gran medida a nuestra comprensión de lo que se puede y no se puede calcular de manera eficiente.

### 1.2 Importancia en la resolución de problemas
El análisis de los algoritmos y su grado de dificultad es clave para resolver problemas en el ámbito de la informática, puesto que ayuda a encontrar la manera más efectiva de manejar información y tomar decisiones. Un problema puede contar con varias soluciones, pero no todas ellas brindan el mismo nivel de eficiencia cuando la cantidad de datos aumenta. Por eso, es crucial comprender el funcionamiento de un algoritmo, el tiempo que necesita para llevarse a cabo y la cantidad de memoria que consume, para poder seleccionar la opción más correcta.
### 1.3 Eficiencia de algoritmos

- **Coste temporal:** 
La complejidad temporal mide la cantidad de tiempo que tarda un algoritmo en ejecutarse a medida que crece el tamaño de entrada (utilizando notación Big O como O(1), O(n), O(n^2)), de igual forma se centra en la cantidad de operaciones o pasos necesarios para resolver un problema.

- **Coste espacial**: La complejidad espacial mide la cantidad de memoria que requiere un algoritmo a medida que crece el tamaño de entrada (también expresada mediante notación Big O), de igual forma considera la memoria necesaria para los datos de entrada, los datos de salida y cualquier memoria adicional utilizada durante la ejecución del algoritmo.

### 1.4 Factores de tiempo de ejecución

El tiempo de ejecución de un algoritmo no depende únicamente de su estructura interna, sino también de varios elementos que influyen en su comportamiento real
- **Factores propios:** Estos factores dependen directamente del diseño y el funcionamiento del algoritmo. Incluyen el rendimiento de las comparaciones, los intercambios, las llamadas recursivas y el manejo de las estructuras de datos internas. Por ejemplo, el ordenamiento de Bubble Sort realiza muchas comparaciones innecesarias, mientras que el Merge Sort organiza su trabajo de forma más eficiente al dividir el problema. Estos factores son inherentes al algoritmo y solo cambian mediante modificaciones en su implementación.

- **Factores circunstanciales:** Estos son factores externos al algoritmo en sí, pero que afectan de manera considerable su rendimiento en la práctica. Por ende incluyen aspectos como el hardware del ordenador, la carga del sistema operativo, el tipo de datos que se procesan y el orden inicial de los elementos.Por ejemplo algunos de los algoritmos funcionan mejor si los datos estan previamente ordenados, mientras que otros no se benefician de ello.
- **Análisis teórico:** El análisis teórico se basa en la notacio Big O, por ende permite estimar cómo aumenta el tiempo de ejecución con el aumento en la cantidad de datos. Este análisis no se basa en pruebas experimentales, sino en el análisis estructural del algoritmo. Esto nos permite clasificar los algoritmos como eficientes o ineficientes antes de poder probarlos en la práctica.
- **Análisis experimental:** El análisis experimental consiste en medir el tiempo real de la ejecución del algoritmo con diferentes tamaños de muestra. Este tipo de análisis complementa el análisis teórico, ya que nos permite observar el comportamiento del algoritmo en situaciones reales y bajo condiciones específicas. Al realizar múltiples pruebas y registrar sus tiempos de ejecución, obtenemos los datos concretos, los cuales podemos comparar con la complejidad teórica para evaluar si es el comportamiento esperado.

### 1.5 Notación de complejidad

- **Big O:** La notación Big O es un método para expresar la complejidad algorítmica basada en el tamaño de entrada n. Indica cuántas operaciones realiza un algoritmo en el peor de los casos y cómo escala al aumentar el volumen de datos. Su objetivo principal es ilustrar la eficiencia de un algoritmo independientemente del hardware o los detalles de implementación.
- **Mejor caso:** El mejor caso describe la situación mas favorable para un algoritmo, en la que se necesitan el número mínimo posible de operaciones. Pese a que habitualmente es el escenario ideal, no siempre es el más representativo. El caso óptimo en un algoritmo de búsqueda lineal es cuando se encuentra el elemento bsucado en la posición inicial. Usualmente su complejidad suele expresarse como Ω(n) o simplemente como una versión optimista de Big O.
- **Peor caso:** El peor caso es el escenario menos favorable, ya que es donde un algoritmo realiza la mayor cantidad posible de operaciones. Este caso se suele utilizar  para expresar la complejidad de Big O, ya que asi garantizará un límite superior sin importar la situación, por ejemplo en Quick Sort, el peor de los casos ocurre cuando el pivote divide la lista de forma muy desigual, generando asi una compleljidad  O(n).
- **Caso promedio:** El caso promedio representa el comportamiento esperado del algoritmo considerando entradas típicas o aleatorias. Por ende, es una forma mas realista de medir su rendimiento, ya que no siempre trabajmos con la mejor o la peor situación posible. Por ejemplo Quick Sort, aunque tiene un peor caso cuadrático, en promedio se comporta como O(n log n), lo que lo hace muy eficiente en la práctica.
- **Big O:** La notación Big O se utiliza para describir el peor caso de un algoritmo. Indica el número máximo de operaciones que podría realizar a medida que crece el tamaño de la entrada.
- **Ω:** La notación Ω describe el mejor caso del algoritmo, es decir, el mínimo de operaciones que necesita para resolverse. Representa un límite inferior del rendimiento.
- **Θ:** La notación Θ representa una complejidad exacta, es decir, cuando el algoritmo tiene el mismo comportamiento tanto en el mejor, como en el promedio y el peor caso (al menos en orden de magnitud).

---
## **2. Ejemplos de Complejidad en Java**
En esta sección se presentan las clases creadas dentro del proyecto y el análisis correspondiente a cada una.

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

### **Explicación resumida**

La complejidad es O(1) porque el tiempo de ejecución no depende del tamaño del arreglo. Siempre accede a una posición fija o asigna una variable, aunque el arreglo sea grande o pequeño. Por eso su tiempo es constante.

---

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

### **Explicación resumida**

En la búsqueda binaria cada vez se elimina la mitad del arreglo. No revisa todos los elementos, solo divide y compara hasta encontrar el dato. Como reduce el tamaño a la mitad en cada paso, su complejidad es logarítmica O(log n).

---

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

### **Explicación resumida**

El ciclo **for** recorre todos los elementos una sola vez desde 0 hasta n. Mientras más grande sea **n**, más veces se ejecuta el ciclo. Por eso su tiempo crece de forma lineal con respecto al tamaño del dato, es decir **O(n)**.

---

## **2.4 Complejidad O(n log n) – Lineal-Logaritmica** 
### Archivo: ComplejidadNLogN.java
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

### **Explicación resumida**

Algoritmos como Merge Sort y Quick Sort dividen el arreglo en partes (eso es log n) y luego procesan todos los elementos para ordenarlos (eso es n). Al combinar ambos procesos, la complejidad total es n * log n, es decir O(n log n).

---
    
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

En Bubble, Insertion y Selection Sort se usan dos ciclos anidados. El primer ciclo recorre los elementos y el segundo los compara nuevamente. Esto hace que el trabajo sea proporcional a n * n, lo que se expresa como O(n²).

---



# **Conclusiones**
**Diana Borja**:
> A medida que desarrollamos esta investigación, pude comprender de manera más produnfa cuan importante es el análisis de comlejidad y la eficiencia que tiene la misma en los algoritmos. Por ello, al comparar diferentes métodos de ordenamiento y búsqueda, pude corroborar que existe algoritmos que aunque sean muy faciles de implementar, no siempre son los adecuados para manejrar grandes cantidadees de información, mientras que otros como Merge Sort o la Busqueda Binaria siempre destacaran por su eficiencia.

**Bryan Barros**:
> El estudio de las complejidades algorítmicas permite evaluar el rendimiento de un programa antes de ejecutarlo. Mediante el análisis del costo temporal y espacial podemos determinar qué tan eficiente será un algoritmo según el crecimiento de los datos. Las notaciones como O(1), O(n), O(n²) y O(log n) describen cómo aumenta el tiempo o la memoria requerida, teniendo en cuenta factores como ciclos, recursividad, comparaciones y particiones del problema. En conclusión, comprender la complejidad permite seleccionar y diseñar algoritmos que utilicen mejor los recursos y ofrezcan soluciones óptimas para diferentes necesidades en la programación.

---

