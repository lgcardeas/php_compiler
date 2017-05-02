package main;

public class MultNode extends BinaryNode{
    public MultNode(Node left, Node right) { super(left, right); }
    
    @Override
    public Value eval(){
        Value a = left.eval();
        Value b = right.eval();
        
        return new Value(a.asInteger() * b.asInteger());
    }
}
