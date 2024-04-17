package Actividad12;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class actividad12 {
    
    public static void main(String[] args) {
        
        //algoritmo();

        Scanner scanner = new Scanner(System.in);
        boolean ciclo = true;
        int conjunto;

       while(ciclo){
        System.out.println("ALGORITMOS DE ORDENAMIENTO: \n");

        System.out.print("-Bubble Sort (Presiona 1) \n-Selection Sort (Presiona 2) \n-Insertion Sort (Presiona 3) \n-Shell Sort (Presiona 4) \n-Salir del programa (Presiona 5)\n\n-Elige una opcion: ");
        int opcion = scanner.nextInt();

        switch(opcion){

            //Bubble Sort
            case 1:
                System.out.println("\n");
                conjunto = conjuntos();
                System.out.println("\n");
                break;
            //Selection Sort
            case 2:
                System.out.println("\n");
                conjunto = conjuntos();
                System.out.println("\n");
                break;
            //Insertion Sort
            case 3:
                System.out.println("\n");
                conjunto = conjuntos();
                System.out.println("\n");
                break;
            //Shell Sort
            case 4:
                System.out.println("\n");
                conjunto = conjuntos();
                System.out.println("\n");
                break;



            case 5:
                ciclo = false;
                break;        
        }
       }

    }


    public static int conjuntos(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Elige un tamaño de conjuntos para testear: ");

        System.out.print("-10 elementos (Presiona 1) \n-100 elementos (Presiona 2) \n-1000 elementos(Presiona 3) \n\n-Elige una opcion: ");
        int option = scanner.nextInt();

        return option;
    }


    public static void algoritmo(){

                 // Crear un arreglo de tamaño 1000 con números aleatorios
                 int[] arr = generarArreglo(1000);

                 // Clonar el arreglo para cada algoritmo
                 int[] arrBubbleSort = arr.clone();
                 int[] arrSelectionSort = arr.clone();
                 int[] arrInsertionSort = arr.clone();
                 int[] arrShellSort = arr.clone();
         
                 // Mostrar el arreglo original
                 System.out.println("Arreglo original:");
                 imprimirArreglo(arr);
         
                 // Aplicar cada algoritmo de ordenamiento y mostrar el resultado
                 System.out.println("\nBubble Sort:");
                 bubbleSort(arrBubbleSort);
                 imprimirArreglo(arrBubbleSort);
         
                 System.out.println("\nSelection Sort:");
                 selectionSort(arrSelectionSort);
                 imprimirArreglo(arrSelectionSort);
         
                 System.out.println("\nInsertion Sort:");
                 insertionSort(arrInsertionSort);
                 imprimirArreglo(arrInsertionSort);
         
                 System.out.println("\nShell Sort:");
                 shellSort(arrShellSort);
                 imprimirArreglo(arrShellSort);

    }


    public static int[] generarArreglo(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000); // Números aleatorios del 0 al 999
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar elementos
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= intervalo && arr[j - intervalo] > temp; j -= intervalo) {
                    arr[j] = arr[j - intervalo];
                }
                arr[j] = temp;
            }
        }
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
