import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.Model;
import view.ListView;

import java.util.Collection;

/**
 * @author Andrey Semenyuk
 */
public class ListIncView extends ListView<Income> {
	private final TableView table;
	private final ObservableList<Income> data =
			FXCollections.observableArrayList(
					new Income(0, "Начальный остаток", 1f)
			);
	final HBox hb = new HBox();

	public ListIncView(Stage stage) {
		table = new TableView();
		stage.setTitle("Доход");
		stage.setWidth(450);
		stage.setHeight(550);

		final Label label = new Label("Список доходов");
		label.setFont(new Font("Arial", 20));

		this.table.setEditable(true);

		final TableColumn uidCol = new TableColumn("УИД");
		uidCol.setMinWidth(10);
		uidCol.setCellValueFactory(
				new PropertyValueFactory<Income, String>("uid"));

		TableColumn nameCol = new TableColumn("Наименование");
		nameCol.setMinWidth(100);
		nameCol.setCellValueFactory(
				new PropertyValueFactory<Income, String>("name"));

		TableColumn sumCol = new TableColumn("Сумма");
		sumCol.setMinWidth(200);
		sumCol.setCellValueFactory(
				new PropertyValueFactory<Income, String>("sum"));

		this.table.setItems(data);
		this.table.getColumns().addAll(uidCol, nameCol, sumCol);

		final TextField addUid = new TextField();
		addUid.setPromptText("0");
		addUid.setMaxWidth(uidCol.getPrefWidth());
		final TextField addName = new TextField();
		addName.setMaxWidth(nameCol.getPrefWidth());
		addName.setPromptText("Наименование");
		final TextField addSum = new TextField();
		addSum.setMaxWidth(sumCol.getPrefWidth());
		addSum.setPromptText("0");

		final Button addButton = new Button("Add");
		addButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				data.add(new Income(
						Integer.valueOf(addUid.getText()),
						addName.getText(),
						Float.valueOf(addSum.getText())));
				addUid.clear();
				addName.clear();
				addSum.clear();
			}
		});

		hb.getChildren().addAll(addUid, addName, addSum, addButton);
		hb.setSpacing(3);

		final VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(label, this.table, hb);

		//((Group) scene.getRoot()).getChildren().addAll(vbox);

	}

	@Override
	public void modelChanged(Model<Collection<Model<Income>>> model) {

	}
}
