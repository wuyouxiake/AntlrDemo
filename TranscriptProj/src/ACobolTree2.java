

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;


public class ACobolTree2 {

	public static void main(String[] args) {
		try {
			
			
			String strInput = "";
			
			//strInput = "E:\\Cobol2Java\\URGENT\\testCobol.cbl";
			strInput = "C:\\Users\\Yang.Ye\\Desktop\\CBLCLM12.cbl";
			ANTLRInputStream input = new ANTLRFileStream(strInput);
			CobolLexer lexer = new CobolLexer(input);
			
			lexer.removeErrorListeners();
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CobolParser parser = new CobolParser(tokens);
			
			parser.setBuildParseTree(true);			
			RuleContext tree = parser.startRule();
			//RuleContext tree = parser.file();
			tree.inspect(parser); //show in UI
	//		System.out.println(tree.toStringTree(parser));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
