package com.yuanwhy.yuan;

import com.yuanwhy.yuan.ast.ASTNode;
import com.yuanwhy.yuan.token.Token;

import java.io.IOException;
import java.util.List;

/**
 * Created by why on 2015/10/30.
 */
public class Compiler {
    public static void main(String[] args) throws IOException{
        String sourcePath = "sample.yuan";
        Lexer lexer = new Lexer(ClassLoader.getSystemResource(sourcePath).getPath());
        List<Token> tokens = lexer.getTokens();
        for (int i = 0; i < tokens.size(); i++) {
            tokens.get(i).getType();
        }
        System.out.println(tokens);

        Parser parser = new Parser();
        parser.readTokens(tokens);
        ASTNode ast = parser.getAST();
        System.out.println(ast);

    }
}
