package main;

public class AtomNode implements Node {

    private Value value;

    public AtomNode(Object v) {
      value = v == null ? Value.NULL : new Value(v);
    }
    
    @Override
    public Value eval() {
        return value;
    }

}
