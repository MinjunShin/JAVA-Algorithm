package chap04;

public class IntStack {
	private int max; // ���� �뷮
	private int ptr; // ���� ������
	private int[] stk; // ���� ��ü
	
	//���� �� ���� : ������ ����ִ� ���
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			System.out.println("EmptyIntStackException ���� �߻�");
		}
	}

	// ���� �� ���� : ������ ���� �� ���
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	//������
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int [max]; // ���� ��ü�� �迭 ����			
		} catch(OutOfMemoryError e) { // ������ �� ����
			max = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	public int indexOf(int x) {
		for(int i = ptr-1 ; i >= 0 ; i--) {
			if(stk[i] == x)
				return i;
		}
		return -1;
	}
	
	//������ ���
	public void clear() {
		ptr = 0;
	}
	
	//������ �뷮 ��ȯ
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;		
	}
	
	public boolean IsEmpty() {
		return ptr <= 0;
	}
	
	public boolean IsFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0)
			System.out.println("������ ����ֽ��ϴ�.");
		else {
			for(int i = stk[0] ; i < ptr ; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}	
	
}