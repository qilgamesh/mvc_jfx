import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 * @author Andrey Semenyuk
 */
public class TestPane extends BorderPane {

	public TestPane() {

		setPrefHeight(600);
		setPrefWidth(900);

		// top

		final Button btnFirst = new Button("button");
		btnFirst.setFont(Font.font("Monospace"));
		final ToolBar toolBar = new ToolBar(btnFirst);
		setTop(toolBar);

		// bottom

		final HBox hBox = new HBox();
		hBox.setPrefHeight(30);
		setBottom(hBox);

		// left

		final TreeView treeView = new TreeView();
		setLeft(treeView);

		// right

		// center

		final GridPane cGridPane = new GridPane();
		setCenter(cGridPane);

	}
}
