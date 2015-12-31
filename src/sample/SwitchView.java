package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Model;
import view.View;

/**
 * @author Andrey Semenyuk
 */
public class SwitchView extends View<Switch> {
	@FXML
	private Label label;

	@FXML
	private void handleOnButtonAction(ActionEvent event) {
		edit(new Switch(true));
	}

	@FXML
	private void handleOffButtonAction(ActionEvent event) {
		edit(new Switch(false));
	}

	public SwitchView() {
	}

	@Override
	public void modelChanged(Model<Switch> model) {
		label.setText(model.toString());
	}
}
