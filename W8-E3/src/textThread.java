import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class textThread implements Runnable{
	String[] array = {"It", "is", "recommended", "to", "use", "Calendar", "class"};
	
	public void extract() {
		int k = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print("Extract"+i+": ");
			k = 0;
			for (int j = 0; j < i; j++) {
				if (k > 6)
					k = 0;
				System.out.print(array[k]+" ");
				k++;
			}
			System.out.println();
		}
	}
	
	public void random() {
		List<String> randString = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
		    randString.add(array[i]);
		}
		Collections.shuffle(randString);
		System.out.println("Random: " + randString);
	}
	
	public void random(String threadName) {
		try {
			System.out.println("\n\nThread is suspended");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> randString = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
		    randString.add(array[i]);
		}
		Collections.shuffle(randString);
		System.out.println("Random: " + randString);
	}


	@Override
	public void run() {
		// Get current thread & its name
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();

		System.out.println("Thread " + threadName + " is running...");
		
		if (threadName == "text")
			
			extract();

		
		else if (threadName == "word1")
			random(threadName);		
		else if (threadName == "word2")
			random();
	}
}
