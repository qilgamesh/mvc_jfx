package model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author Andrey Semenyuk
 */
public class Income {
	private final SimpleIntegerProperty uid;
	private final SimpleStringProperty name;
	private final SimpleFloatProperty sum;

	public Income(int uid, String name, float sum) {
		this.uid = new SimpleIntegerProperty(uid);
		this.name = new SimpleStringProperty(name);
		this.sum = new SimpleFloatProperty(sum);
	}

	public int getUid() {
		return uid.get();
	}

	public void setUid(int uid) {
		this.uid.set(uid);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public Float getSum() {
		return sum.get();
	}

	public void setSum(Float sum) {
		this.sum.set(sum);
	}
}
