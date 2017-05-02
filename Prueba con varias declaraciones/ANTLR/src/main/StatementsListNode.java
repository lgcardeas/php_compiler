package main;

import java.util.ArrayList;
import java.util.List;

public class StatementsListNode implements Node{
    
    private List<Node> statemens;
    
    public StatementsListNode(){
        statemens = new ArrayList<Node>();
    }
    
    public void addStatement(Node s) {
        if(s != null)
            statemens.add(s);
    }
    
    @Override
    public Value eval(){    
        for(Node i: statemens){
            i.eval();
        }
        
        return Value.VOID;
    }

}
