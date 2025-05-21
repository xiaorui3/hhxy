package org.example;

public class Demo2 {
    public int  logicExemple(int x,int y){
        int magic =0;
        if(x>0&&y>0){
            magic=x+y+10;
        }else{
            magic=x+y-10;
        }
        if (magic<0){
            magic=0;
        }
        return magic;
    }
    public int  logicExemple2(int x,int y){
        int magic =0;
        if(x>0&&y>0){
            magic=x+y+10;
        }else{
            magic=x+y-10;
        }
        if (magic<0){
            magic=0;
        }
        return magic;
    }

}
