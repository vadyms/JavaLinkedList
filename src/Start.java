
public class Start {

	public static void main(String[] args) {
		Queue queue1 = new Queue();
		for(int k=0; k<=10; k++) {
			queue1.addElement(new Element<String>(k, k+" - Element"));
		}
		
		queue1.removeFirst();
		
		Queue queue2 = new Queue();
		for(int k=10; k<=20; k++) {
			queue2.addElement(new Element<Integer>(k, k));
		}
		
		queue2.removeLatest();
		queue2.removeFirst();
		
		System.out.println(queue1.equals(queue2));
	}
}
