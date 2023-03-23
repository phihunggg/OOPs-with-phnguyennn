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
//public class Static {
//    static int count = 0;
//    
//    Static(){
//        count++;
//        System.out.println(count);
//}
//    public static void main(String args[]){
//        Static c1 = new Static();
//        Static c2 = new Static();
//        Static c3 = new Static();
//    }
//    
//        
//    }

public class Static {

    int rollno;
    String name;
    static String college = "buu chinh vien thong";

    static void change() {
        college = "Dai hoc cong nghe ";
    }

    public Static(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        Static.change();

        Static s1 = new Static(111, "hung");
        Static s2 = new Static(222, "trung");
        Static s3 = new Static(333, "tam");

        s1.display();
        s2.display();
        s3.display();
    }
}
    
