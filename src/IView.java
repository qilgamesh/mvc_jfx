import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 * @author Andrey Semenyuk
 */
public interface IView {

	TableView<Income> addTableView();

	Label addTitle(String title);


}
