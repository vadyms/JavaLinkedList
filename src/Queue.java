
public class Queue {
	Element<?> e;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void addElement(Element<?> el) {
		
		el.next = this.e;
		this.e = el;
		if (el.next!=null) {
			el.next.previous = e;	
		}
		this.size++;
	}
	
	public Element<?> removeLatest() {
		Element<?> result = this.e; 
		Element<?> tQueue = this.e.next;
		this.e = tQueue;
		this.e.previous = null;
		this.size--;
		return result;
	}
	
	public Element<?> removeFirst() {
		Element<?> curent = this.e;
		for (int k=this.size; k>1; k--) {
			curent = curent.next;
		}
		curent.next = null;
		this.size--;
		return curent;
	}
	
	public Element<?> getElement(int num) {
		Element<?> curent = this.e;
		for (int k=0; k<=size-num-1; k++) {
			curent = curent.next;
		}
		return curent;
	}
	
}