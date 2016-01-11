package controller;

import model.Model;

/**
 * @author Andrey Semenyuk
 */
public interface IController<O, M extends Model<P>, P> {
	/**
	 * Выполнить
	 *
	 * @param operation операция
	 * @param model     модель
	 * @param attribute атрибут операции
	 */
	void execute(O operation, M model, P attribute);

}
