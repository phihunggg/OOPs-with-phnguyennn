/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CacTuKhoa;

/**
 *
 * @author Hung Nguyen
 */
//public class Final {
//    final int MAX_SPEED = 90;
//    
//    void run(){
//        MAX_SPEED = 60;
//    }
//    public static void main(String args[]){
//        Final f = new Final();
//        f.run();
//    }
//}


//class man{
//    final void run(){
//        System.out.println("cry");
//    }
//}
//class woman extends man{
//    public static void main(String args[]){
//        new woman().run();
//    }
//}


//neu khai bao tham so la final thi chung ta khong the thay doi gia tri cua no
class B{
    int cube(final int n){
    //n = n + 2; // gia tri n la final nen chuong trinh bao loi
        return n;
    }
    
    public static void main(String args[]){
        B b = new B();
        b.cube(7);
    }
}
