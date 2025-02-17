package Queue;

public class circularQueue {
	int[] s;
	int front, rear;
	int max;
	
	public circularQueue(int m) {
		max = m;
		front = -1;
		rear = -1;
		s = new int[m];
	}
	
	void enqueue(int x) {
		if(rear+1%max == front) {System.out.println(" Queue if full");return;}
		if(front==-1) {front = front+1%max;}
//		if(rear == max-1) {rear = -1;}
		
		rear = (rear+1)%max;
		s[rear] = x;
		return;
		
	}
	
	void dequeue() {
		if(rear == -1) {
			return;
		}
		
		else if(rear == front) {rear = -1;front = -1;}
		
		else {
			front = front+1%max;
		}
		
		
	}
	
	void display() {
		System.out.println(rear +" "+ front);
		if(rear<front) {
			for(int i = 0;i<=rear; i++) {
				System.out.print(s[i%max] + " ");
			}
			
			for(int i = rear; i<front-1; i++) {
				System.out.print("__" + " ");
			}
			
			for(int i = front;i<=max-1; i++) {
				System.out.print(s[i%max] + " ");
			}
			
		}
		
		
		else {
			for(int i = 0; i<front; i++) {
				System.out.print("__ ");
			}
			for(int i = front; i<=rear; i++) {
				System.out.print(s[i] + " ");
			}
			for(int i = rear+1; i<max;i++) {
				System.out.print("__ ");
			}
		}
		System.out.println();
		}
	

	public static void main(String[] args) {
		circularQueue s = new circularQueue(10);
		s.enqueue(1);
		s.enqueue(2);
		s.enqueue(3);
		s.enqueue(4);
		s.enqueue(1);
		s.enqueue(2);
		
		s.dequeue();
		s.dequeue();
		s.dequeue();
//		
		s.enqueue(10);
		s.enqueue(2);
		s.enqueue(3);
		s.enqueue(4);
		s.enqueue(0);
		s.enqueue(100);
		s.enqueue(2);
		s.enqueue(2);
//		
		s.dequeue();	
		s.dequeue();
		s.display();
		
		System.out.println("\n"+ 10%10);
	}

}
