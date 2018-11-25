package grafos;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.io.*;
import org.jgrapht.traverse.*;

public class PrimeroMejor {

	public static void main(String[] args) {
		Graph<Nodo, DefaultWeightedEdge> grafo = crearGrafo();
		/*

		  System.out.println(grafo.toString());
		  Nodo nodoActual = obtenerNodoInicial(grafo);

		  for(int i=0;i<adyacentes.size();i++) {
			  System.out.println(adyacentes.get(i).getLlave());
			  System.out.println(adyacentes.get(i).getValor());
		  }

		 List<Nodo> adyacentes = new ArrayList<>();
		  Nodo nodoActual = obtenerNodoInicial(grafo);
		  adyacentes = Graphs.successorListOf(grafo, nodoActual);
		  //adyacentes = Graphs.neighborListOf(grafo, nodoActual);
		  Nodo a = new Nodo();
		  //a = obtenerNodoMayorEuristica(nodoActual, adyacentes);
		 //Set<DefaultWeightedEdge> aristas =  grafo.edgesOf(nodoActual);
		// for (DefaultWeightedEdge arista : aristas) {
			// double costo = grafo.getEdgeWeight(arista);
			 //System.out.println(costo);
			for(int i= 0 ; i<adyacentes.size(); i++){
				System.out.println(adyacentes.get(i).getLlave());
			}

		 
		
		List<Integer> vertexes = new ArrayList<Integer>();
        Graph<Integer, DefaultWeightedEdge> grafo = GenerateRandomGraph(vertexes);
       
        int source =  ThreadLocalRandom.current().nextInt(0,  vertexes.size()-1) ;
        int destiny=0;
       
        boolean repeat = true;
       
        while(repeat) {
            destiny = ThreadLocalRandom.current().nextInt(0,  vertexes.size()-1);
            repeat = source == destiny;
        }
       
        long startTime = System.nanoTime();
        AlgoritmnAStar.BeamSearch(grafo, vertexes.get(source), vertexes.get(destiny),10);
        long endTime = System.nanoTime();
 
        System.out.println("Tomo: "+(endTime - startTime)+" Nanosegundos");
		*/
		primeroMejor(grafo);
	}

	private static Graph<Nodo, DefaultWeightedEdge> crearGrafo(){
		Graph<Nodo, DefaultWeightedEdge> grafo = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);
		/*
        Nodo a = new Nodo("A", 5, false, true);
        Nodo b = new Nodo("B",10);
        Nodo c = new Nodo("C",12);
        Nodo d = new Nodo("D",8);
        Nodo e = new Nodo("E",15);
        Nodo f = new Nodo("F",20);
        Nodo g = new Nodo("G",38);
        Nodo h = new Nodo("H",25);
        Nodo i = new Nodo("I",30);
        Nodo j = new Nodo("J",27);
        Nodo k = new Nodo("K",55);
        Nodo l = new Nodo("L",65);
        Nodo m = new Nodo("M",58);
        Nodo n = new Nodo("N",62);
        Nodo enie = new Nodo("enie",110);
        Nodo o = new Nodo("O",120);
        Nodo p = new Nodo("P",200,true, false);

        grafo.addVertex(a);
        grafo.addVertex(b);
        grafo.addVertex(c);
        grafo.addVertex(d);
        grafo.addVertex(e);
        grafo.addVertex(f);
        grafo.addVertex(g);
        grafo.addVertex(h);
        grafo.addVertex(i);
        grafo.addVertex(j);
        grafo.addVertex(k);
        grafo.addVertex(l);
        grafo.addVertex(m);
        grafo.addVertex(n);
        grafo.addVertex(enie);
        grafo.addVertex(o);
        grafo.addVertex(p);

        DefaultWeightedEdge edge1 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge2 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge3 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge4 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge5 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge6 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge7 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge8 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge9 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge10 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge11 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge12 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge13 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge14 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge15 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge16 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge17 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge18 = new DefaultWeightedEdge();
        DefaultWeightedEdge edge19 = new DefaultWeightedEdge();

        grafo.addEdge(a, b, edge1);
        grafo.addEdge(a, c, edge2);
        grafo.addEdge(a, d, edge3);
        grafo.addEdge(b, e, edge4);
        grafo.addEdge(b, f, edge5);
        grafo.addEdge(e, k, edge6);
        grafo.addEdge(f, l, edge7);
        grafo.addEdge(k, enie, edge8);
        grafo.addEdge(l, enie, edge9);
        grafo.addEdge(c, g, edge10);
        grafo.addEdge(c, h, edge11);
        grafo.addEdge(g, o, edge12);
        grafo.addEdge(h, m, edge13);
        grafo.addEdge(m, o, edge14);
        grafo.addEdge(m, p, edge15);
        grafo.addEdge(d, i, edge16);
        grafo.addEdge(d, j, edge17);
        grafo.addEdge(j, n, edge18);
        grafo.addEdge(i, p, edge19);


        grafo.setEdgeWeight(edge1, 2);
        grafo.setEdgeWeight(edge2, 3);
        grafo.setEdgeWeight(edge3, 4);
        grafo.setEdgeWeight(edge4, 1);
        grafo.setEdgeWeight(edge5, 5);
        grafo.setEdgeWeight(edge6, 10);
        grafo.setEdgeWeight(edge7, 12);
        grafo.setEdgeWeight(edge8, 15);
        grafo.setEdgeWeight(edge9, 20);
        grafo.setEdgeWeight(edge10, 2);
        grafo.setEdgeWeight(edge11, 3);
        grafo.setEdgeWeight(edge12, 25);
        grafo.setEdgeWeight(edge13, 12);
        grafo.setEdgeWeight(edge14, 20);
        grafo.setEdgeWeight(edge15, 25);
        grafo.setEdgeWeight(edge16, 4);
        grafo.setEdgeWeight(edge17, 5);
        grafo.setEdgeWeight(edge18, 10);
        grafo.setEdgeWeight(edge19, 25);
        */
        
		Nodo a = new Nodo("A", 10, false, true);
		Nodo b = new Nodo("B",25);
		Nodo c = new Nodo("C",15);
		Nodo d = new Nodo("D",23);
		Nodo e = new Nodo("E",10);
		Nodo f = new Nodo("F",15);
		Nodo g = new Nodo("G",90, true, false);
		Nodo h = new Nodo("H",2);
		Nodo i = new Nodo("I",27);

		grafo.addVertex(a);
		grafo.addVertex(b);
		grafo.addVertex(c);
		grafo.addVertex(d);
		grafo.addVertex(e);
		grafo.addVertex(f);
		grafo.addVertex(g);
		grafo.addVertex(h);
		grafo.addVertex(i);

		DefaultWeightedEdge edge1 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge2 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge3 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge4 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge5 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge6 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge7 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge8 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge9 = new DefaultWeightedEdge();

		grafo.addEdge(a, b, edge1);
		grafo.addEdge(a, c, edge2);
		grafo.addEdge(a, d, edge3);
		grafo.addEdge(b, e, edge4);
		grafo.addEdge(b, f, edge5);
		grafo.addEdge(c, g, edge6);
		grafo.addEdge(d, h, edge7);
		grafo.addEdge(d, i, edge8);

		grafo.setEdgeWeight(edge1, 1);
		grafo.setEdgeWeight(edge2, 1);
		grafo.setEdgeWeight(edge3, 1);
		grafo.setEdgeWeight(edge4, 1);
		grafo.setEdgeWeight(edge5, 1);
		grafo.setEdgeWeight(edge6, 1);
		grafo.setEdgeWeight(edge7, 1);
		grafo.setEdgeWeight(edge8, 1);
		
		/*
		
		Nodo a = new Nodo("A", 5, false, true);
		Nodo b = new Nodo("B",9);
		Nodo c = new Nodo("C",50);
		Nodo d = new Nodo("D",120);
		Nodo e = new Nodo("E",8);
		Nodo f = new Nodo("F",25,true, false);
		Nodo g = new Nodo("G",12);
		Nodo h = new Nodo("H",500);
		Nodo i = new Nodo("I",2);
/*
		grafo.addVertex(a);
		grafo.addVertex(b);
		grafo.addVertex(c);
		grafo.addVertex(d);
		grafo.addVertex(e);
		grafo.addVertex(f);
		grafo.addVertex(g);
		grafo.addVertex(h);
		grafo.addVertex(i);

		DefaultWeightedEdge edge1 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge2 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge3 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge4 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge5 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge6 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge7 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge8 = new DefaultWeightedEdge();
		DefaultWeightedEdge edge9 = new DefaultWeightedEdge();

		grafo.addEdge(a, b, edge1);
		grafo.addEdge(a, c, edge2);
		grafo.addEdge(a, d, edge3);
		grafo.addEdge(b, e, edge4);
		grafo.addEdge(b, f, edge5);
		grafo.addEdge(c, g, edge6);
		grafo.addEdge(d, h, edge7);
		grafo.addEdge(d, i, edge8);

		grafo.setEdgeWeight(edge1, 1);
		grafo.setEdgeWeight(edge2, 1);
		grafo.setEdgeWeight(edge3, 1);
		grafo.setEdgeWeight(edge4, 1);
		grafo.setEdgeWeight(edge5, 1);
		grafo.setEdgeWeight(edge6, 1);
		grafo.setEdgeWeight(edge7, 1);
		grafo.setEdgeWeight(edge8, 1);

 */
		return grafo;
	}

	private static Nodo obtenerNodoInicial(Graph<Nodo, DefaultWeightedEdge> grafo) {
		Nodo nodo = new Nodo();
		for(Nodo item : grafo.vertexSet()) {
			if(item.isNodoSalida()) {
				nodo = item;
				return nodo;
			}
		}
		return nodo;
	}

	private static Nodo obtenerNodoMayorEuristica(Nodo nodoActual,List<Nodo> sucesores,List<Nodo> visitados ){
		/* DefaultWeightedEdge edge;
		 List<DefaultWeightedEdge> aristas = (List<DefaultWeightedEdge>) grafo.edgesOf(nodoActual);
		 for(int i= 0 ; i<aristas.size(); i++){
		 	aristas.get(i).toString();
		 }*/
		Nodo nodoMax = null;
		double maximo = -1;
		for(int i=0; i<sucesores.size(); i++){
			if(sucesores.get(i).getValor()>= maximo && !visitados.contains((Nodo) sucesores.get(i))){
				maximo = sucesores.get(i).getValor();
				nodoMax = sucesores.get(i);
			}
		}
		return nodoMax;
	}

	private static Nodo obtenerNodoPredecesorVisitado(Nodo nodoActual,List<Nodo> predecesores,List<Nodo> visitados ){
		Nodo nodoPredecesor = null;
		for(int i=0; i<predecesores.size(); i++){
			if(visitados.contains((Nodo) predecesores.get(i))){
				nodoPredecesor = predecesores.get(i);
			}
		}
		return nodoPredecesor;
	}

	private static void primeroMejor(Graph<Nodo, DefaultWeightedEdge> grafo) {
		
		List<Nodo> visitados = new ArrayList<>();
		List<Nodo> sucesores = new ArrayList<>();
		List<Nodo> predecesores = new ArrayList<>();
		boolean nodoEncontrado = false;
		boolean hayCaminos = true;
		Nodo nodoActual = null;
		Nodo nodoAux = null;
		boolean terminado = false;
		boolean sinSucesorRestantes = false;
		while(!nodoEncontrado && hayCaminos && terminado != true) {//Todavia no llegue al nodo destino y quedan caminos por recorrer
			if(nodoActual == null) {// Si todavia no tengo el nodo donde empezar la busqueda
				nodoActual = obtenerNodoInicial(grafo);
				System.out.println("Nodo: " + nodoActual.getLlave() +" Contiene el Comienzo");
				visitados.add(nodoActual); //AGREGO a la lista de visitados por donde comienzo
			}else {// Ya tengo el nodo donde empezar
				sucesores = Graphs.successorListOf(grafo, nodoActual); //VEO si el nodo tiene sucesores
				if(sucesores.isEmpty() == false){    //SI encontramos nodos sucesores 
					nodoAux = nodoActual;
					nodoActual = obtenerNodoMayorEuristica(nodoActual, sucesores,visitados);//agarro el nodo con mejor Euristica
					if(nodoActual != null && nodoActual.isNodoLlegada()  ) {
						visitados.add(nodoActual);
						nodoEncontrado = true;
						System.out.println("Nodo: " + nodoActual.getLlave() +" Contiene el destino final con valor de: " + nodoActual.getValor());
					}
						else{
						System.out.println("Nodo: " + nodoActual.getLlave() +" con valor de: " + nodoActual.getValor() + " No es la llegada, se vera el siguiente" );
						visitados.add(nodoActual);
						nodoAux = nodoActual;
					}
				}else{//SI NO QUEDAN SUCESORES; VUELVO A LA LISTA DE VISITADOS
					if(visitados.size() == 1  ){
						System.out.println("SOLO HAY UN NODO Y NO HAY SOLUCION");
						terminado = true;
						hayCaminos = false;
					}else{//Si hay mas de uno visitado significa que hay mas de un nodo...
						//System.out.println("OBTENDREMOS NODO PREDECESOR DE " + nodoActual.getLlave());
						nodoActual = obtenerNodoPredecesorVisitado(nodoActual, Graphs.predecessorListOf(grafo,nodoActual), visitados);
						//System.out.println(nodoActual.getLlave());
						// nodoAux = visitados.get(visitados.size()-2); //Agarro el ultimo de los visitados y chequeo si hay otro hijo.
						nodoAux = nodoActual;
						sucesores = Graphs.successorListOf(grafo, nodoActual); //VEO si el nodo tiene sucesores
						nodoActual = obtenerNodoMayorEuristica(nodoAux, sucesores,visitados);


						if(nodoActual == null){//Si busco los sucesores y no hay ninguno, vuelvo a retroceder a un predecesor
							nodoActual = obtenerNodoPredecesorVisitado(nodoAux, Graphs.predecessorListOf(grafo,nodoAux), visitados);
							if(visitados.size() == grafo.vertexSet().size()){//Si la lista de visitados es la misma que la cant de nodos, no hay solucion
								System.out.println("No se encontro una posible solucion");
								terminado = true;
							}
						}else{
							if(nodoActual.isNodoLlegada()) {
								visitados.add(nodoActual);
								nodoEncontrado = true;
								System.out.println("Nodo: " + nodoActual.getLlave() +" Contiene el destino final con valor de: " + nodoActual.getValor());
							}
							else{
								System.out.println("Nodo: " + nodoActual.getLlave() +" con valor de: " + nodoActual.getValor() + " No es la llegada, se vera el siguiente" );
								visitados.add(nodoActual);
								nodoAux = nodoActual;
							}
						}
					}
				}
			}
		}
	}

	public static Graph<Integer, DefaultWeightedEdge> GenerateRandomGraph(List<Integer> vertexes )
    {
        Graph<Integer, DefaultWeightedEdge> grafo = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);
       
        //RANDOM DE MAXIMOS VERTICES , VA DE MAXIMO 100 A 200
        int maxVertexes = ThreadLocalRandom.current().nextInt(100,  200);
       
        for(int i = 0 ; i <= maxVertexes ; i++)
        {
            int random = ThreadLocalRandom.current().nextInt(0,  1000);
            if( !vertexes.contains(random))
            {
                Integer value = new Integer(random);
                vertexes.add(value);
                grafo.addVertex(value);
            }
        }
        //EN ESTA PARTE AGREGO UN CAMINO QUE LLEVE A TODO , YO QUERIA SER UN MAESTRO POKEMON , NO PUDE SERLO , POR ESO HICE ESTA BOSTA :D
        List<Integer> open = new ArrayList<Integer>(vertexes);
       
        int current = 0;
        int next = 0;
        while( open.size() != 2 )
        {
            boolean repeat = true;
           
            while(repeat) {
                next = ThreadLocalRandom.current().nextInt(0,  open.size()-1);
                repeat = current == next;
            }
           
            DefaultWeightedEdge edge = new DefaultWeightedEdge();
 
            grafo.addEdge( open.get(current) , open.get(next) , edge);
           
            int cost = ThreadLocalRandom.current().nextInt(0, 1000);
           
            grafo.setEdgeWeight(edge, cost);
           
            open.remove(current);
            if(current < next) {
                current = next == 0 ? 0 : next-1;
            }
            else
            {
                current = next;
            }
           
        }
        //ACA ESTA LAS ARISTAS EXTRA A AGREGAR , ES UN RANDOM DEL 200 AL 300
        int addingEdges = ThreadLocalRandom.current().nextInt(200,  300);
       
        for(int i = 0 ; i <= addingEdges ; i++ )
        {
            int source = ThreadLocalRandom.current().nextInt(0,  vertexes.size()-1);
            int destiny = 0;
            boolean repeat = true;
           
            while(repeat)
            {
                destiny = ThreadLocalRandom.current().nextInt(0,  vertexes.size()-1);
                repeat = source == destiny;
            }
           
            DefaultWeightedEdge edge = new DefaultWeightedEdge();
           
            grafo.addEdge( vertexes.get(source) , vertexes.get(destiny) , edge);
        }
       
        return grafo;
    }
	
}


