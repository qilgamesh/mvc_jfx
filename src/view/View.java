package view;

import controller.Controller;
import model.Model;

/**
 * @author Andrey Semenyuk
 */
public abstract class View<P> extends BaseView<Model<P>, P> {
	private final Controller<P> controller = new Controller<P>();

	/**
	 * Редактировать модель
	 *
	 * @param property свойство модели
	 */
	protected void edit(P property) {
		controller.execute(Controller.O.EDIT, getModel(), property);
	}
}