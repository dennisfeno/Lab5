package application;

import java.util.List;

public class TestModel {

	public static void main(String[] args) {

		Model model = new Model();
		List<Scacchiera> solutions = model.findSolution(8) ;

		if (solutions != null) {
			
			int i = 1;
			for (Scacchiera sc : solutions) {
				System.out.println(i+"\n"+sc);
				i++;
			}

			int counter = solutions.size();
			System.out.println(String.format("Numero di soluzioni trovate: %d\n", counter));
		}
	}

}
