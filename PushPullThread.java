
public class PushPullThread implements Runnable {
	
	private String text;
	private Action act;
	private boolean turn;
	
	public PushPullThread(String text, Action act, boolean turn) {
		super();
		this.text = text;
		this.act = act;
		this.turn = turn;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Action getAct() {
		return act;
	}

	public void setAct(Action act) {
		this.act = act;
	}

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i += 1) {
			act.printText(text, turn);
		}
		
	}
	
	


}
