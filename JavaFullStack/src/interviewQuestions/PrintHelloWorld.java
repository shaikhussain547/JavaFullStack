package interviewQuestions;

public class PrintHelloWorld {
	
	//Print Hello World without using semicolon (;)

	public static void main(String[] args) {
		
		//1
		if(System.out.printf("Hello World" + "\n") == null) {
			
		}
		//2
		if(System.out.append("Hello World" + "\n") == null) {
			
		}
		//3
		if(System.out.append("Hello World" + "\n").equals(null)) {
			
		}
		//4
		for(int i=0; i<1; System.out.println("Hello World")) {
			i++;
		}
		
	}
}
