package controller;

import model.Model;

/**
 * @author Andrey Semenyuk
 */
public interface IController<O, M extends Model<P>, P> {

	void execute(O operation, M model, P attribute);
}
