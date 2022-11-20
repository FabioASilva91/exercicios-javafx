package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Button botaA = new Button("A");
		Button botaB = new Button("B");
		Button botaC = new Button("C");
		
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(botaA);
		box.getChildren().add(botaB);
		box.getChildren().add(botaC);
		
		Scene unicaCena = new Scene(box, 100, 150);
		
		primaryStage.setScene(unicaCena);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
