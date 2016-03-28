
public class StackX {
	private int top;
	private int maxSize;
	private char[] stackArray;
	public StackX(int s) {
		// TODO Auto-generated constructor stub
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	public void push(char c) {
		stackArray[++top] = c;
	}
	public char pop() {
		return stackArray[top--];
	}
	public char peak() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public int size(){// ������� ������ �����
	 return top+1;
	}
	public char peekN(int n){ // ������ �������� � �������� n
	 return stackArray[n]; 
	}
	public void displayStack(String s){
	System.out.print(s);
	System.out.print("Stack (bottom-->top): ");
	for(int j=0; j<size(); j++){
	System.out.print( peekN(j) );
	System.out.print(' ');
	}
	System.out.println("");
	}
}
