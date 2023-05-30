/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math_with_java;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Piero
 */
public class Operations {
    
    public void addition(){
        
        ArrayList<Double> nums = new ArrayList();
        boolean num = true;
        Double add = 0.0;
        Scanner in = new Scanner(System.in);
        
        while(num == true){
            System.out.println("Write a number to be added \n");
            Double ans = in.nextDouble();
            nums.add(ans);
            //add += ans;
            
            System.out.println("Are you want to Continue adding numbers? write y for yes or any key for no");
            String bool = in.next();
            num = "y".equals(bool);
        }
        
        for(Double i : nums){
            add += i;
        }
        
        System.out.println(add);
    }
}
