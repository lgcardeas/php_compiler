package main;

public class IfNode implements Node{
    private Node cond;
    private Node ifTrue;
    private Node ifFalse;
    
    public IfNode(Node cond, Node ifTrue, Node ifFalse){
        this.cond = cond;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }
    
    
    @Override
    public Value eval(){
        if(cond.eval().asBoolean())
            ifTrue.eval();
        else
            ifFalse.eval();
        
        return Value.VOID;
    }

}
