import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

/**
 * @author Andrey Semenyuk
 */
public class Income implements Serializable {
	private final SimpleIntegerProperty uid;
	private final SimpleStringProperty name;
	private final SimpleFloatProperty sum;

	public Income(Integer uid, String name, Float sum) {
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
