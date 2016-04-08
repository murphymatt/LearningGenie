import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DecisionTree {
    
    DecisionNode root;

    public DecisionTree() {
	root = new GuessNode("Dog");
    }
    
    public DecisionTree(File file) {
    
    }
    
    public int countObjects() {
	if (root == null) {
	    return 0;
	} else {
	    return 1 + countObjects(root.right) + countObjects(root.left);
	}
    } // int countObjects() 
    
    public void guess(Scanner in) {
	
    } // void guess(Scanner in)
    
    public void write(FileWriter out) throws IOException {
	
    } // void write(FileWriter out)
}
