import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuessNode implements DecisionNode{
	public String g;

	@Override
	public DecisionNode guess(Scanner in) {
		
		String guess = in.nextLine();
		return new DecisionNode(guess,);
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
