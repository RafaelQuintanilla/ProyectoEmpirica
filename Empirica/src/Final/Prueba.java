package Final;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0, elemento;
		String nombre;
		ArbolBinario arbolito = new ArbolBinario();
		do{
			try{
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Agregar Nodo\n"
						+ "2. Salir\n "
								+ "Elige una opcion "
						, JOptionPane.QUESTION_MESSAGE));
				switch(opcion){
					case 1:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingresa el numero del nodo", "Agregando Nodo"
							,JOptionPane.QUESTION_MESSAGE));
					nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo", "Agregando Nodo"
							,JOptionPane.QUESTION_MESSAGE); 
					arbolito.agregarNodo(elemento, nombre);
					break;
					
					case 2:
						JOptionPane.showMessageDialog(null, "Aplicacion finalizada","fin", JOptionPane.INFORMATION_MESSAGE);
					break;
					
					default:
						JOptionPane.showMessageDialog(null, "Opcion incorrecta"," CUIDADO", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}catch(NumberFormatException n){
				JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
			}
		}while (opcion !=2);
	
	
		
	}

}
