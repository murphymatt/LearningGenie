import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public interface DecisionNode {

	public DecisionNode guess(Scanner in);
	
	public int countObjects();
	
	public void write(FileWriter out) throws IOException;
}
