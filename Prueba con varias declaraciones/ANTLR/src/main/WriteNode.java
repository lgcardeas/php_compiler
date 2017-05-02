package main;


public class WriteNode implements Node{
    //private List<Node> elements;
    private Node expression;
    
    public WriteNode(Node e){
        expression = e;
    }
    
    /*public void addElement(Node a){
        elements.add(a);
    }*/
    
    @Override
    public Value eval(){
        /*for(Node i: elements){
            System.out.println(i.eval().toString());
        }*/
        System.out.println(expression.eval().toString());
        return Value.VOID;
    }
}
