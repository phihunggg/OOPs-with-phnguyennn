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
interface Printable{  
    void print();  
}  
interface Showable{  
    void print();  
}  
   
class TestTnterface1 implements Printable,Showable{  
    public void print() {
        System.out.println("Hello");
    }  
     
    public static void main(String args[]) {  
        TestTnterface1 obj = new TestTnterface1();  
        obj.print();  
    }
}  