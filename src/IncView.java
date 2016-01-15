import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 * @author Andrey Semenyuk
 */
public class IncView extends GridPane implements IView {

	public IncView() {
		setHgap(10);
		setVgap(10);
		setPadding(new Insets(0, 10, 0, 10));

		add(addTitle("Доходы"), 1, 0);
		add(addTableView(), 1, 1);

	}

	@Override
	public TableView<Income> addTableView() {
		TableView<Income> table = new TableView<>();
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

		return table;
	}

	@Override
	public Label addTitle(String title) {
		Label label = new Label(title);
		label.setFont(new Font("Arial", 20));

		return label;
	}
}
