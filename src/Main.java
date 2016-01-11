import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Andrey Semenyuk
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private TestPane root;
	@Override
	public void start(Stage stage) {
		root = new TestPane();

		Scene scene = new Scene(root);


		stage.setScene(scene);
		stage.show();
	}
}
