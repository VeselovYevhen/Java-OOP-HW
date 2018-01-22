
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Action act = new Action();
		
		PushPullThread pull = new PushPullThread("Pull", act, true);
		PushPullThread push = new PushPullThread("Push", act, false);
		
		Thread pullThread = new Thread (pull);
		Thread pushThread = new Thread(push);
		
		pullThread.start();
		pushThread.start();
		

	}

}
