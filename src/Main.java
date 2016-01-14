import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Andrey Semenyuk
 */
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new TestPane());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Test JavaFX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
