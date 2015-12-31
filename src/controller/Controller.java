package controller;

import model.Model;

public class Controller<P> implements IController<Controller.O, Model<P>, P> {

	public enum O {

		EDIT
	}

	public void execute(O operation, Model<P> model, P attribute) {
		if (operation == null)
			throw new NullPointerException("Пустой параметр operation");
		if (model == null)
			throw new NullPointerException("Пустой параметр model");
		if (attribute == null)
			throw new NullPointerException("Пустой параметр attribute");
		switch (operation) {
			case EDIT:
				model.setProperty(attribute);
				break;
			default:
				throw new IllegalArgumentException("Неизвестная операция: " + operation);
		}

	}
}
