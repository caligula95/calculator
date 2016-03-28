
public class ParsePostnew {
	private StackXforPostfix theStack;
	private String input, input1;
	public ParsePostnew(String s) {
		input1 = s;
	}
	public double doParse() {
		theStack = new StackXforPostfix(20);
		//String[] ch; 
		int j;
		double num1, num2, interAns = 0;
		input = input1.trim();
		String [] ch  = input.split(" ");
		for (j = 0; j < ch.length; j++) {
			 theStack.displayStack(" "+ch[j]+" ");
			 if (!ch[j].equals("+") && !ch[j].equals("-") && !ch[j].equals("*") && !ch[j].equals("/") && !ch[j].equals("^") && !ch[j].equals("#")) {
				 theStack.push(Double.parseDouble(ch[j]));
			 }
			 else {
				 num2 = theStack.pop();
				 num1 = theStack.pop();
				 switch(ch[j]) {
				 case "+":
					 interAns = num1+num2;
					 break;
				 case "-":
					 interAns = num1-num2;
					 break;
				 case "*":
					 interAns = num1*num2;
					 break;
				 case "/":
					 interAns = num1/num2;
					 break;
				 case "^":
					 interAns = Math.pow(num1, num2);
					 break;
				 case "#":  interAns = Math.pow(num2, 1/num1);
				 	break;
				default: interAns = 0;
				 }
				 theStack.push(interAns);
			 }
		}
		interAns = theStack.pop();
		return interAns;
		
	}
}
