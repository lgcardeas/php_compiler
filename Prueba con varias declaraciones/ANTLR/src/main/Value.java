package main;

public class Value implements Comparable<Value>{
    
    public static final Value NULL = new Value();
    public static final Value VOID = new Value();
    
    private Object value;
    
    public Value(){
        value = new Object();
    }
    
    public Value(Object v){
        if(v == null) {
            throw new RuntimeException("v == null");
        }
        value = v;
        // only accept boolean, list, number or string types
//        if(!(isBoolean() || isList() || isNumber() || isString())) {
//            throw new RuntimeException("invalid data type: " + v + " (" + v.getClass() + ")");
//        }
    }
    
    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isNumber() {
        return value instanceof Number;
    }
    
    public boolean isNull() {
        return this == NULL;
    }

    public boolean isVoid() {
        return this == VOID;
    }
    
    public Integer asInteger(){
        return ((Number)value).intValue();
    }
    
    public Boolean asBoolean(){
        return (Boolean)value;
    }
    
    @Override
    public int compareTo(Value v){
        if(this.isNumber() && v.isNumber()){
            if(this.equals(v))
                return 0;
            else
                return this.asInteger().compareTo(v.asInteger());
        }
        else {
            throw new RuntimeException("illegal expression: can't compare `" + this + "` to `" + v + "`");
        }
    }
    
    @Override
    public String toString(){
        return String.valueOf(value);
    }
    
}
