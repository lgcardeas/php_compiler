package main;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

public class Main {

    /**
     * @param args
     * @throws IOException 
     * @throws RecognitionException 
     */
    public static void main(String[] args) throws IOException, RecognitionException {
        // TODO Auto-generated method stub
        ANTLRInputStream input = new ANTLRInputStream((InputStream)new FileInputStream("src\\resources\\input.p"));
        PLexer lexer = new PLexer(input);  ///Sele pasa el archivo al lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);  // Se crea el flujo de tokens
        PParser parser = new PParser(tokens);  //Se le pasa el flujo de tokens al parser
        PParser.parse_return r = parser.parse(); //Devuelve el AST....
        
        CommonTree tree = (CommonTree)r.getTree();
        DOTTreeGenerator gen = new DOTTreeGenerator();  
        StringTemplate st = gen.toDOT(tree);  
        FileWriter dotFile = new FileWriter("src\\resources\\qtree.dot");
        dotFile.write(st.toString());
        dotFile.close();
        
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(tokens);
        PInterpreter interpreter = new PInterpreter(nodes);
        interpreter.interprete().eval();

    }

}
