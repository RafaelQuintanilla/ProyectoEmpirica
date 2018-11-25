package Final;

public class NodoArbol {
	int dato;
	NodoArbol hijoIzquierdo;
	NodoArbol hijoDerecho;
	String nombre;
	
	public NodoArbol(int d, String nom){
		this.dato = d;
		this.nombre = nom;
		this.hijoDerecho = null;
		this.hijoIzquierdo = null;
		
	}
	
	public String toString (){
		return nombre + "Su dato es: " + dato;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
