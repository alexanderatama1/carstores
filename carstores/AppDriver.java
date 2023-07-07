/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cse1iox.carstores;

/**
 *
 * @author alexa
 */
public class AppDriver {

    public static void main(String[] args) {
        // Code application logic here
        
        Cars my_car = new Cars("Ford", 2020, "white", 25000f, 0f);
        System.out.println("My car's color is " + my_car.getColor());
    }
    
}
