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
// class Dinasour {
//
//    public Dinasour() {
//        System.out.println("Dinasour is bitting");
//    }
//
//}
//
//class Dog extends Dinasour {
//
//    public Dog() {
//        super();
//        System.out.println("Dog is eating");
//    }
//
//    public static void main(String args[]) {
//        Dog d = new Dog();
//    }
//
//    
//}

class vehicle {

    vehicle() {
        System.out.println("vehicle is created");
    }
}

//class Bike extends vehicle {
//
//    int speed;
//
//    Bike(int speed) {
//        this.speed = speed;
//        System.out.println(speed);
//    }
//
//    public static void main(String args[]) {
//        Bike b = new Bike(10);
//    }
//}

class Person {
    void message(){
        System.out.println("welcome");
    }    
}

class Human extends Person{
    void message(){
        System.out.println("welcome person");
    }
    void display(){
        message();
        super.message();
    }
    public static void main(String args[]){
        Human h = new Human();
        h.display();
    }
}


