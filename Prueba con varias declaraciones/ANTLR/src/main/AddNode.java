package main;

public class AddNode extends BinaryNode{
    public AddNode(Node left, Node right) { super(left, right); }
    
    @Override
    public Value eval() {
        Value a = left.eval();
        Value b = right.eval();
        
        return new Value(a.asInteger() + b.asInteger());
    }
}
