/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice.Interface;

/**
 *
 * @author Hung Nguyen
 */
public class testInterface1 {
   public static void main(String[] args) {
      Square square = new Square(5);
      System.out.println("Area of square: " + square.getArea());
      System.out.println("Perimeter of square: " + square.getPerimeter());
   }
}
