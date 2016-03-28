
public class StackXnew {
	private int top;
	private int maxSize;
	private String[] stackArray;
	public StackXnew(int s) {
		// TODO Auto-generated constructor stub
		maxSize = s;
		stackArray = new String[maxSize];
		top = -1;
	}
	public void push(String c) {
		stackArray[++top] = c;
	}
	public String pop() {
		return stackArray[top--];
	}
	public String peak() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public int size(){// ������� ������ �����
	 return top+1;
	}
	public String peekN(int n){ // ������ �������� � �������� n
	 return stackArray[n]; 
	}
	public void displayStack(String s){
	System.out.print(s);
	System.out.print("Stack (bottom-->top): ");
	for(int j=0; j<size(); j++){
	System.out.print( peekN(j) );
	System.out.print(" ");
	}
	System.out.println("");
	}
}
