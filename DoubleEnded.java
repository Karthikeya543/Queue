package Queue;

//import java.util.function.DoubleUnaryOperator;

public class DoubleEnded {
	int front, rear;
	int[] dq;
	int max;
	
	public DoubleEnded() {
		max = 10;
		dq = new int[max];
		front = -1;
		rear = -1;
	}
	
	void frontEnqueue(int a) {
		if(front == -1) {
			front++;rear++;
			dq[front] = a;return;
		}
		if(front == 0) {
			System.out.println("Cannot be inserted in the start...");return;
		}
		front--;
		dq[front]=a;
	}
	
	void rearEnqueue(int a) {
		if(front==-1) {front++;}
		rear++;
		
		dq[rear] = a;
	}
	
	void frontDequeue() {
		if(front == rear) {System.out.println("Underfow");front = -1;rear = -1;}
		else {
			front++;
		}
	}
	void rearDequeue() {
		if(front == rear) {System.out.println("Underfow");front = -1;rear = -1;}
		else {
			rear--;
		}
	}
	
	void diaplay() {
		
		
		if(front==rear && front == -1) {
			for(int i = 0; i<max;i++) {
				System.out.print("__ ");
			}
			return;
		}
		
		for(int i = 0; i<front; i++) {
			System.out.print("__ ");
		}
		for(int j = front; j<=rear; j++) {
			System.out.print(dq[j] + " ");
		}
		for(int i = rear+1; i<max; i++) {
			System.out.print("__ ");
		}
	}
	

	public static void main(String[] args) {
		DoubleEnded s = new DoubleEnded();
		s.frontEnqueue(100);
		s.rearEnqueue(200);
		s.frontEnqueue(100);
		s.frontDequeue();
		s.frontDequeue();
		
		s.rearEnqueue(1);
		s.rearEnqueue(2);
		s.rearEnqueue(1);
		s.rearEnqueue(2);
		s.rearEnqueue(1);
		s.rearEnqueue(2);
		s.rearEnqueue(1);
		s.rearEnqueue(2);
		s.rearEnqueue(1);
		s.rearEnqueue(2);
		s.frontEnqueue(22);
		s.frontDequeue();
		s.frontDequeue();
		s.frontDequeue();
		s.frontDequeue();
		s.frontDequeue();
		s.frontDequeue();
		s.frontDequeue();
		s.frontDequeue();
		s.frontDequeue();
		s.frontDequeue();
		s.frontEnqueue(22);
		s.diaplay();

	}

}
