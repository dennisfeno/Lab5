/**
 * livello: numero di regine inserite - livello iesimo, i regine inserite. 
 * la soluzione parziale non è ammissibile
 * una soluzione completa è una soluzione in cui ho inserito 8 regine.
 * ho tre filtri: uno sulle righe, uno sulle colonne e uno sulle diagonali. 
 * data una soluzione completa, come faccio a sapere se è valida? se arrivo all'ultimo passo di sicuro sarà giusta perché ho verificato 
 * passo - passo ogni vincolo. 
 * posso usare una lista di integer, oppure List<Regina>, mi piace una lista di 8 elementi. 
 * al massimo inserisco una regina per riga, quindi non è utile usare una matrice, perché mi porto una struttura dati troppo grossa
 * utilizzo un array di dimensione 8*8, tanto devo rappresentare 64 cose, quindi chiaramente in ogni riga avrò una sola regina
 * in ogni posizione inserisco il numero della colonna della regina alla riga iesima della posizione dell'array.
 * il passo è l'indice della riga. 
 */

package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Ruzzle.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
