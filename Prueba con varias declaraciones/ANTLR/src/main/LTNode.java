package main;

public class LTNode extends BinaryNode{
    public LTNode(Node left, Node right) { super(left, right); }

    @Override
    public Value eval() {
        Value a = left.eval();
        Value b = right.eval();
        
        return new Value(a.asInteger() < b.asInteger());
    }
}
