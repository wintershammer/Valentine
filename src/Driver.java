import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		if (!args[0].equalsIgnoreCase("repl")) {
			MyGLexer lexer = new MyGLexer(new ANTLRFileStream(args[0]));
			MyGParser parser = new MyGParser(new CommonTokenStream(lexer));
			ParseTree tree = parser.program();
			MyVisitor visitor = new MyVisitor();
			visitor.visit(tree);
			
		} else if (args[0].equalsIgnoreCase("repl")) { //THIS NEEDS SOME CLEANUP AND A WAY TO DELETE PREVIOUS LINES
			MyVisitor visitor = new MyVisitor(); //you want this outside the loop so it retains its enviroment/memory!
			try {
				boolean run = true;
				while(run){
					System.out.print(">>>");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String input;
					StringBuffer sb = new StringBuffer();
					while ((input = br.readLine()).length()!=0) {
						sb.append(input);
					}
					if(sb.toString().equals("exit")){
						run = false;
					}
					MyGLexer lexer = new MyGLexer(new ANTLRInputStream(sb.toString()));
					MyGParser parser = new MyGParser(new CommonTokenStream(lexer));
					ParseTree tree = parser.program();
					visitor.visit(tree);
				}
			} 
			catch (IOException io) {
				io.printStackTrace();
			}
			
		} 
		else {
			System.out.println("Invalid argument");
		}

	}
}
