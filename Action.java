
public class Action {
	
	private boolean turn = true;

	public synchronized void printText (String text, boolean turn) {
		for (;this.turn == turn;) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		System.out.print(text + " - ");
		
		this.turn =! this.turn;
		notifyAll();
	}
	
	
	
	
	
	
}
