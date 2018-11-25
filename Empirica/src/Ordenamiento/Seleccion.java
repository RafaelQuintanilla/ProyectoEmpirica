package Ordenamiento;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Seleccion {

public static void generarVectorRandon(int A[], int tamaño){
	for (int x=0; x<tamaño; x++){
		  A[x] = (int) (Math.random()*990000000)+1;
	}
}
	
public static void seleccion(int A[]) {
	          int i, j, menor, pos, tmp;
	          for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
	                menor = A[i]; // de los elementos que quedan por ordenar
	                pos = i; // y guardamos su posición
	                for (j = i + 1; j < A.length; j++){ // buscamos en el resto
	                      if (A[j] < menor) { // del array algún elemento
	                          menor = A[j]; // menor que el actual
	                          pos = j;
	                      }
	                }
	                if (pos != i){ // si hay alguno menor se intercambia
	                    tmp = A[i];
	                    A[i] = A[pos];
	                    A[pos] = tmp;
	                }
	          }
	}
	
public static void quickSort(int[] vector, int izquierda, int derecha) {
    
	int pivote = vector[izquierda];
    int i = izquierda;
    int j = derecha;
    int auxIntercambio;
    while (i < j) {
        while (vector[i] <= pivote && i < j) {
            i++;
        }
        while (vector[j] > pivote) {
            j--;
        }
        if (i < j) {
            auxIntercambio = vector[i];
            vector[i] = vector[j];
            vector[j] = auxIntercambio;
        }
    }
    vector[izquierda] = vector[j];
    vector[j] = pivote;
    if (izquierda < j - 1) {
        quickSort(vector, izquierda, j - 1);
    }
    if (j + 1 < derecha) {
        quickSort(vector, j + 1, derecha);
    }
}
	
public static void binarySort(int array[]) 
{ 
    for (int i = 1; i < array.length; i++) 
    { 
        int x = array[i]; 

        // Find location to insert using binary search 
        int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1); 

        //Shifting array to one location right 
        System.arraycopy(array, j, array, j+1, i-j); 

        //Placing element at its correct location 
        array[j] = x; 
    } 
}	

 public static void tiempo() throws InterruptedException{     
        long inicio = System.currentTimeMillis();
         
        Thread.sleep(2000);
         
        long fin = System.currentTimeMillis();
         
        double tiempo = (double) ((fin - inicio)/1000);
         
        System.out.println(tiempo +" segundos");
         
    }
     
public static void mostrarVector(int A[]){
	for (int i= 0 ; i < A.length; i++)
		System.out.print(A[i]+",");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		/*
		long inicio = System.currentTimeMillis();	
		int vector1[] = new int[2000];
		generarVectorRandon(vector1, 1000);
		mostrarVector(vector1);
		System.out.println();
		seleccion(vector1);
		mostrarVector(vector1);
		System.out.println();	
	
	
	long inicio = System.currentTimeMillis();	
	int vector1[] = new int[1000	];
	generarVectorRandon(vector1, 1000);
	mostrarVector(vector1);
	System.out.println();
	quickSort(vector1, 0, vector1.length - 1);
	mostrarVector(vector1);
	System.out.println();
	*/
	
		
		long inicio = System.currentTimeMillis();	
		int vector1[] = new int[1000];
		generarVectorRandon(vector1, 1000);
		mostrarVector(vector1);
		System.out.println();
		binarySort(vector1);
		mostrarVector(vector1);
		System.out.println();
   

	
	long fin = System.currentTimeMillis();
	double tiempo = (double) ((fin - inicio));
    System.out.println(tiempo +" miliSegundos");
	
	

		
	}

}
