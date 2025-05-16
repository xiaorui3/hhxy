package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Demo demo = new Demo();
        float js = demo.js(1, 3, 2);
        System.out.println(js);
    }
}
