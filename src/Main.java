import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Andrey Semenyuk
 */
public class Main extends Application {

	private TestPane root;

	@Override
	public void start(Stage primaryStage) {
		root = new TestPane();
		Scene scene = new Scene(root);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Test JavaFX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
