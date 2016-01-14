import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 * @author Andrey Semenyuk
 */
public class IncView extends GridPane {

	public IncView() {
		setHgap(10);
		setVgap(10);
		setPadding(new Insets(0, 10, 0, 10));

		TableView<Income> table = new TableView<>();

		final Label label = new Label("Доходы");
		label.setFont(new Font("Arial", 20));
		add(label, 1, 0);

		table.setEditable(true);

		final TableColumn uidCol = new TableColumn<Income, Object>("День");
		uidCol.setMinWidth(10);

		TableColumn nameCol = new TableColumn("Наименование");
		nameCol.setMinWidth(150);

		TableColumn sumCol = new TableColumn("Сумма");
		sumCol.setMinWidth(50);

		table.getColumns().addAll(uidCol, nameCol, sumCol);
		table.getItems().add(new Income(0, "Начальный остаток", 1f));

		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		add(table, 1, 1);

	}
}
