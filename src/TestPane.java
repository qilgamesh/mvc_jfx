import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
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
		btnFirst.setFont(Font.font("Arial", 14));
		final ToolBar toolBar = new ToolBar(btnFirst);
		toolBar.setStyle("-fx-background-color: #336699;");
		setTop(toolBar);

		// bottom

		final HBox hBox = new HBox();
		//hBox.setPrefHeight(30);
		setBottom(hBox);

		// left


		//setLeft(addAccordion());
		setLeft(treeView());

		// right

		// center

		final GridPane cGridPane = new GridPane();
		setCenter(cGridPane);

	}

	private Accordion addAccordion() {
		Accordion accordion = new Accordion();
		ListView<String> listView = new ListView<>();
		ObservableList<String> items = FXCollections.observableArrayList(
				"Всё вместе", "Расходы", "Доходы", "Кредиты и долги");
		listView.setItems(items);
		listView.getSelectionModel().select(0);
		TitledPane titledPane = new TitledPane("Основная", listView);

		accordion.getPanes().add(titledPane);
		accordion.setExpandedPane(titledPane);

		return accordion;
	}

	private TreeView<String> treeView() {
		TreeItem<String> rootItem = new TreeItem<>("Главная");
		rootItem.setExpanded(true);

		ObservableList<String> items = FXCollections.observableArrayList(
				"Всё вместе", "Расходы", "Доходы", "Кредиты и долги");
		for (String s : items) {
			rootItem.getChildren().add(new TreeItem<String>(s));
		}

		return new TreeView<>(rootItem);
	}

}
