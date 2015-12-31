package model;

/**
 * @author Andrey Semenyuk
 */
public interface IModelSubscriber<P> {

	void modelChanged(Model<P> model);
}
