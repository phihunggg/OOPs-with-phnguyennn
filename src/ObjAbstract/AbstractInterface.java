/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjAbstract;

/**
 *
 * @author Hung Nguyen
 */
public class AbstractInterface {
    
}
interface s1{
    void a();
    abstract void b();
    void c();
    public void d();
    
}

abstract class s2 implements s1{
    public void d(){
            System.out.println("i am d");
}
    
}

class s3 extends s2{
    public void a(){
        System.out.println("i am a");
    }
    
    public void b(){
        System.out.println("i am b");
    }
    
    public void c(){
        System.out.println("i am c");
    }
}

class test{
    public static void main(String args[]){
        s1 s = new s3();
        s.a();
        s.b();
        s.c();
        s.d();
    }
}