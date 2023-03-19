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

public class NapChongPhuongThuc {
 void sum(int a, long b) {
  System.out.println(a + b);
 }
 
 void sum(int a, int b, int c) {
  System.out.println(a + b + c);
 }
 
 public static void main(String args[]) {
  NapChongPhuongThuc obj = new NapChongPhuongThuc();
  // kiểu integer tham số 2 sẽ được thay đổi thành kiểu long
  obj.sum(20, 20);  
  obj.sum(20, 20, 20);
 }
}   

