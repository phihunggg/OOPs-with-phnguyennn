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
public class Equals {
    public static void main(String args[]){
        String s1 = new String("this is a string");
        String s2 = new String("this is a string");
        
        System.out.println("s1 = s2 " + (s1 == s2));
        System.out.println("s1 equals s2 " + (s1.equals(s2)));
    }
}
