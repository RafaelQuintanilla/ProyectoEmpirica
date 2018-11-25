package Final;

public class ArbolBinario {
	NodoArbol raiz;
	
	public ArbolBinario(){
		this.raiz = null;
	}
	//Metodo para insertar nodos en el arbol
	public void agregarNodo( int d, String nom){//de MENOR A MAYOR IZQ A DERECHA
		NodoArbol nuevo = new NodoArbol(d, nom);
		if (raiz == null){
			raiz = nuevo;
		}else{
			NodoArbol auxiliar = raiz;
			NodoArbol padre;
			while (true){
				padre = auxiliar;
				if(d<auxiliar.dato){
					auxiliar = auxiliar.hijoIzquierdo;
					if(auxiliar == null){
						padre.hijoIzquierdo = nuevo;
						return;
					}
				}else{//es mayor
					auxiliar = auxiliar.hijoDerecho;
					if(auxiliar == null){
						padre.hijoDerecho = nuevo;
						return;
					}
				}
			}
		}
	}
}
