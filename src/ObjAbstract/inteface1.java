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
public class inteface1 {
    
}
interface print{
    void draw();
}

class photo implements print{
    public void draw(){
        System.out.println("hello");
    
    }
    
    public static void main(String args[]){
        photo p = new photo();
        p.draw();
    }
}
