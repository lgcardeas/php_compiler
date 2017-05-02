/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Los_Kballeros
 */
public class forNode implements Node{
    private Node asig;
    private Node cond;
    private Node expr;
    private Node sent;
    
    public forNode(Node asig, Node cond, Node expr, Node sent){
        this.asig = asig;
        this.cond = cond;
        this.expr = expr;
        this.sent = sent;
    }

 
    
    @Override
    public Value eval(){
        for ( asig.eval().asInteger(); cond.eval().asBoolean();expr.eval()){
            sent.eval();
        }
        return Value.VOID;
    }

}
