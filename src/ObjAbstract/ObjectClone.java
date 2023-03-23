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
class Student implements Cloneable {
    int rollno;
    String name;
 
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
 
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
 
    public static void main(String args[]) {
        try{
            Student s1 = new Student(101, "An");
            Student s2 = (Student) s1.clone();
            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
