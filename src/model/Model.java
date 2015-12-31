package model;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Andrey Semenyuk
 */
public class Model<P> {
	private P property;

	private final Collection<IModelSubscriber<P>> subscribers = new CopyOnWriteArrayList<IModelSubscriber<P>>();

	public Model(P property) {
		if (property == null)
			throw new NullPointerException("Пустой параметр");
		this.property = property;
	}

	public P getProperty() {
		return property;
	}

	public void setProperty(P property) {
		if (property == null) {
			throw new NullPointerException("Пустой параметр");
		}
		this.property = property;
		notifySubscribers();
	}

	protected void notifySubscribers() {
		for (IModelSubscriber<P> subscriber : subscribers)
			notifySubscriber(subscriber);
	}

	private void notifySubscriber(IModelSubscriber<P> subscriber) {
		subscriber.modelChanged(this);
	}

	public void subscribe(IModelSubscriber<P> subscriber) {
		if (subscriber == null)
			throw new NullPointerException("Пустрой параметр");
		if (subscribers.contains(subscriber))
			throw new IllegalArgumentException("Повторная подписка: " + subscriber);
		subscribers.add(subscriber);
		notifySubscriber(subscriber);
	}

	public void unsubscribe(IModelSubscriber<P> subscriber) {
		if (subscriber == null)
			throw new NullPointerException("Пустой параметр");
		if (!subscribers.contains(subscriber))
			throw new IllegalArgumentException("Неизвестный подписчик: " + subscriber);
		subscribers.remove(subscriber);
	}
}
