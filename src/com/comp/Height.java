package com.comp;

public class Height {
    private int feet;
    private int inch;
    public void simplify(){
        if (inch > 11){
            feet++;
            inch -= 12;
            simplify();
        }
    }
    public Height(int ft, int in){
        feet = ft;
        inch = in;
        simplify();
    }
    public Height(int in){
        inch = in;
        simplify();
    }
    public void add(int inches){
        inch += inches;
        simplify();
    }
    public int getFt(){return feet;}
    public int getIn(){return inch;}
    public void add(Height ht){
        feet += ht.getFt();
        inch += ht.getIn();
        simplify();
    }

}
