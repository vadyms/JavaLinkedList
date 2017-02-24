
public class Element<T> {
	Element<?> next;
	Element<?> previous;
	T t;
	int id;
	
	public Element(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Element(int id, T t) {
		super();
		
		this.id = id;
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
