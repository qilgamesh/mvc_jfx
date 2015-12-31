package view;

import controller.Controller;
import model.Model;

/**
 * @author Andrey Semenyuk
 */
public abstract class View<P> extends BaseView<Model<P>, P> {
	private Controller<P> controller = new Controller<P>();

	protected void edit(P property) {
		controller.execute(Controller.O.EDIT, getModel(), property);
	}
}
