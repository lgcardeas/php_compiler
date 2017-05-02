package main;

import java.util.HashMap;

public class IDNode implements Node{
    private HashMap<String, Value> memory;
    private String id;
    
    public IDNode(HashMap<String, Value> memory, String id){
        this.memory = memory;
        this.id = id;
    }
    
    @Override
    public Value eval(){
        Value v = memory.get(id);
        if(v == null) {
            throw new RuntimeException("Unknown variable: " + v);
        }
        
        return v;
    }
}
