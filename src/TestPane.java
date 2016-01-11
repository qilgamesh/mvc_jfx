import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 * @author Andrey Semenyuk
 */
public class TestPane extends StackPane {

	TestManager testManager;

	public TestPane() {
		testManager = new TestManager();

	}

	private HBox createToolBar(){
		HBox toolbar=new HBox();
		toolbar.setAlignment(Pos.CENTER);
		toolbar.setPadding(new Insets(10.0));
		Button btItem1 = createButtonItem("mSave", "Save Session", t->testManager.saveSession());
		Button btItem2 = createButtonItem("mRestore", "Restore Session", t->testManager.restoreSession());
		Button btItem3 = createButtonItem("mInfo", "About the Game", t->testManager.about());
		toolbar.getChildren().setAll(btItem1, btItem2, btItem3);
		Button btItem6 = createButtonItem("mQuit", "Quit Game", t->testManager.quit());
		toolbar.getChildren().add(btItem6);
		return toolbar;
	}
	private Button createButtonItem(String symbol, String text, EventHandler<ActionEvent> t){
		Button g = new Button();
		g.setPrefSize(40, 40);
		g.setId(symbol);
		g.setOnAction(t);
		g.setTooltip(new Tooltip(text));
		return g;
	}

}
