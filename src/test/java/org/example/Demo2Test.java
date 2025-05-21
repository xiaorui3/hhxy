package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Demo2Test {

    @Test
    public void logicExemple() {
        Demo2 demo2 = new Demo2();
        int a=demo2.logicExemple(1,1);
        int e=12;
        /*if (a==e){
            System.out.println("<OK>");
        }else{
            System.out.println("<NOT OK>");
        }*/
        Assert.assertEquals(a,e);
    }
}