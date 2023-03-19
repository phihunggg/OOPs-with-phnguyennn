/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

/**
 *
 * @author Hung Nguyen
 */
abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Ve hinh chu nhat");
    }
}

class Circle1 extends Rectangle{
    void draw(){
        System.out.println("Ve hinh tron");
    }
}

public class testAbstract1 {
    public static void main(String args[]){
    Shape s = new Circle1();
    s.draw();
}
    
}
