package view;

import model.IModelSubscriber;
import model.Model;

/**
 * @author Andrey Semenyuk
 */
public abstract class BaseView<M extends Model<P>, P> implements
		IModelSubscriber<P> {
	private M model;

	protected M getModel() {
		return model;
	}

	public void setModel(M model) {
		unsubscribe();
		this.model = model;
		subscribe();
	}

	private void subscribe() {
		if (model != null) {
			model.subscribe(this);
		}
	}

	private void unsubscribe() {
		if (model != null) {
			model.unsubscribe(this);
		}
	}

	public void dispose() {
		unsubscribe();
	}

}
