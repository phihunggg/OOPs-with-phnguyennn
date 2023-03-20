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
public class Square extends Shape2D {
   private double side;

    public Square(double side) {
        this.side = side;
    }

  
      public double getArea() {
      return side * side;
   }

   // triển khai phương thức getPerimeter của Shape2D
   public double getPerimeter() {
      return 4 * side;
   }
}
