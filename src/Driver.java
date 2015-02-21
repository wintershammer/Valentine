import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MyGLexer lexer = new MyGLexer(new ANTLRFileStream("test.vlnt"));
		MyGParser parser = new MyGParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.program();
		MyVisitor visitor = new MyVisitor();
		visitor.visit(tree);
		

	}

}
