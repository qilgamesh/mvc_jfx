package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("switch.fxml"));
		primaryStage.setTitle("Simple MVC JavaFX Application");
		Scene scene = new Scene(root);
		SwitchView view = new SwitchView();
		view.setModel(new Model<Switch>(new Switch()));
		primaryStage.setScene(scene);

		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}
