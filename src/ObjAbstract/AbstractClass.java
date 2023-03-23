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
abstract class Animal {

    abstract void eat();
}

class Cat extends Animal {

    void eat() {
        System.out.println("Cat is eating");
    }

    public static void main(String args[]) {
        Animal a = new Cat();
        a.eat();
    }
}

abstract class Motor{
    abstract void speed();
}

class Car extends Motor{
    void speed(){
        System.out.println("car run with 20km/h");
    }
}

class Plane extends Motor{
    void speed(){
        System.out.println("Plane fly with 200km/h");
    }
}
class testAbstraction{
    public static void main(String args[]){
        Motor m = new Plane();
        m.speed();
        
    }
}