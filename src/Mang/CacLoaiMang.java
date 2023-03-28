/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;

import java.util.Arrays;

/**
 *
 * @author Hung Nguyen
 */
public class CacLoaiMang {
    public static void main(String[] args){
        String[] cars = {"Honda", "BMWs", "Toyota", "Lexus"};
        System.out.println(cars[0]);
        
        System.out.println("----------------------------------");
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
}
        System.out.println("----------------------------------");
        cars[0] = "Morning";
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
}
        
        System.out.println("-----------------------------------");
        System.out.println("length of the array: " + cars.length);
        
        
        System.out.println("-----------------------------------");
        for(String car : cars){{
            System.out.println(car);
        }
        
        System.out.println("------------------------------------");
        Arrays.sort(cars);
            System.out.println("");
        
    }
}
}
    
   
    

