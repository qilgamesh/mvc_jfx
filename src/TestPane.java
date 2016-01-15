import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

import java.time.LocalDate;

/**
 * @author Andrey Semenyuk
 */
public class TestPane extends BorderPane {

	LocalDate nowDate = LocalDate.now();

	ObservableList<String> months = FXCollections.observableArrayList("Январь", "Февраль", "Март");

	public TestPane() {

		setPrefHeight(600);
		setPrefWidth(900);

		// top

		final Button btnFirst = new Button("button");
		ChoiceBox<String> currMonth = new ChoiceBox<>(months);
		currMonth.getSelectionModel().select(nowDate.getMonthValue() - 1);

		Pane middleOfTBox = new Pane();

		final HBox toolBar = new HBox(btnFirst, middleOfTBox, currMonth);
		HBox.setHgrow(middleOfTBox, Priority.ALWAYS);

		toolBar.setPadding(new Insets(5, 10, 5, 10));
		toolBar.setStyle("-fx-background-color: #336699;");
		toolBar.setPrefHeight(30);

		setTop(toolBar);

		// bottom

		final HBox hBox = new HBox();
		hBox.setPrefHeight(30);
		setBottom(hBox);

		// left


		setLeft(addAccordion());
		//setLeft(treeView());

		// right

		// center

		setCenter(new IncView());

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
