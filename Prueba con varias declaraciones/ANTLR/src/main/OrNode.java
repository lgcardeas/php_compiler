package main;

public class OrNode extends BinaryNode{
    public OrNode(Node left, Node right) { super(left, right); }

    @Override
    public Value eval() {
        
        Value a = left.eval();
        Value b = right.eval();
        
        return new Value(a.asBoolean() || b.asBoolean());
    }
}
