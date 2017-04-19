package application;

import java.util.ArrayList;
import java.util.List;

public class Model {

	List<Scacchiera> solutions = null ; 
	
	List<Scacchiera> findSolution(int dim){
		
		solutions = new ArrayList<Scacchiera>();
		
		Scacchiera scacchiera = new Scacchiera (dim) ;
		int step = 0 ;
		
			recursive(scacchiera, step) ;
		
		return solutions ; 
		
	}

	private void recursive(Scacchiera scacchiera, int step) {
		
		// controllo condizione di terminazione 
		
		if( step == scacchiera.getDimension() ){
			//System.out.println(scacchiera);
			solutions.add(new Scacchiera(scacchiera)) ;
			
			return ; 
		}
		
		//genero le soluzioni parziali
		// gli indici partono da 0 per comodità
		// il primo vincolo è chiaramente rispettato, perché aggiunge l'elemento in fondo
		// per costruzione metto una regina per ogni riga
		// con un banale not contains verifico che non sia nemmeno sulla stessa colonna
		
		for (int i = 0 ; i < scacchiera.getDimension() ; i++ ) {
			
			if(!scacchiera.contains(i) ){ // se lo contiene è inutile che ne inserisca un altro uguale dentro
				
				//controllo anche la diagonale
				
				scacchiera.add(i) ;
				if ( scacchiera.controllaDiagonale(step) ) 
					recursive(scacchiera, step +1 ) ;
				scacchiera.remove(i) ;
				
			}
			
		}
		
		
	}
	
	

}
