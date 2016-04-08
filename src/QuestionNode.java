import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuestionNode implements DecisionNode{
	public String q; 
	DecisionNode yes;
	DecisionNode no;
	
	public QuestionNode(String question,  DecisionNode ynode, DecisionNode nnode){
		this.q = question;
		
	}
	public DecisionNode guess(Scanner in) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countObjects() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void write(FileWriter out) throws IOException {
		// TODO Auto-generated method stub
		
	}
	

}
