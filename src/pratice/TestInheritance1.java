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
class employee{
    float salary = 1000;
}
class Programmer extends employee{
    int bonus = 150;
}
class Boss extends Programmer{
    int salary1 = 5000;
}
public class TestInheritance1 {
    public static void main (String arg[]){
    
    Boss p = new Boss();
    System.out.println("Programmer salary is: " + p.salary);
    System.out.println("bonus of salary is: " + p.bonus);
    System.out.println("Boss salary is: " + p.salary1);
     
    }
}

// kế thừa đơn
//class Animal{
//    void Eat(){
//         System.out.println("eating...");
//}
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("barking...");
//    }
//}


// kế thừa nhiều cấp
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}

