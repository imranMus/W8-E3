
public class drive {
	public static void main(String args[]) {
		Runnable text = new textThread();
		Runnable text1 = new textThread();
		Runnable text2 = new textThread();
		
		Thread  t = new Thread(text, "text");
		Thread t1 = new Thread(text1, "word1");
		Thread t2 = new Thread(text2, "word2");
		
		t.start();
		t1.start();
		t2.start();
	}
}
