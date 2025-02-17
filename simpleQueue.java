package Queue;

public class simpleQueue {

	int front;
	int rear;
	int[] queue;
	int size;
	
	public void size(int x) {
		this.size = x;
		this.queue = new int[x];
		this.front = -1;
		this.rear = -1;
	}
	
	public void enqueue(int x) {
		
			if(isFull()==1) {
				System.out.println("Queue is Full");
				return;
			}
			
			if(front == -1) {
				front++;
			}
			rear++;
			queue[rear] = x;
	}
	
	
	
	public void dequeue() {
		
		if(isEmpty() == 1) {
			System.out.println("Queue is empty");
		}
		
		else {
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			else {
				front++;
			}
		}
		
	}
	
	
	
	
	public int isFull() {
		if(rear == size-1) {return 1;}
		return -1;
	}
	
	public int isEmpty() {
		if(front == -1 && rear == -1) {return 1;}
		else {return -1;}
	} 
	
	
	
	public void display() {
		for(int i = front; i<=rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		simpleQueue x = new simpleQueue();
		x.size(10);
		
		x.enqueue(1);
		x.enqueue(2);
		x.enqueue(3);
		x.enqueue(4);
		
		x.dequeue();
		x.dequeue();
		x.dequeue();
		x.dequeue();
		
		x.enqueue(1);
		x.enqueue(2);
		x.enqueue(3);
		x.enqueue(4);
		
		x.enqueue(1);
		x.enqueue(2);
		x.enqueue(0);
		
		x.display();
		

	}

}
