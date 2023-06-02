/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathwithjava;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Piero
 */
public class Operations {
    
    public Double addition(){
        
        ArrayList<Double> nums = new ArrayList();
        Double add = 0.0;
        Double ans = 0.0;
        Scanner in = new Scanner(System.in);
        
        while(ans != -999.0){
            System.out.println("Write a number to be added and press -999 to end\n");
            ans = in.nextDouble();
            
            if(ans != -999.0){
                nums.add(ans);
            }
            else
                break;
            
        }
        
        for(Double i : nums){
            add += i;
        }
        
        return add;
    }
    
    public Double subtraction(){
        ArrayList<Double> nums = new ArrayList();
        
        Double sub;
        Double ans = 0.0;
        Scanner in = new Scanner(System.in);
        
        while(ans != -999.0){
            System.out.println("Write a number to be subtracted and press -999 to end.(Use the first number as a base number to be subtracted)\n");
            ans = in.nextDouble();
            if(ans != -999.0){
                nums.add(ans);
            }
            else
                break;
        }
        
        sub = nums.get(0);
        
        /*for(int i = 1; i<nums.size(); i++){
            if(sub<nums.get(i)){
                Double temp = sub;
                sub=nums.get(i);
                nums.set(i,sub);
            }
        }*/
        
        for(int i = 1; i<nums.size(); i++){
            //if(nums.get(i) != sub){
                sub -= nums.get(i);
            //}
        }
        
        return sub;
    }
    
    public Double division(){
        ArrayList<Double> nums = new ArrayList();
        
        Double div;
        Double ans = 0.0;
        Scanner in = new Scanner(System.in);
        
        while(ans != -999.0){
            System.out.println("Write a number to be divided and press -999 to end.(Use the first number as a base number to be subtracted)\n");
            ans = in.nextDouble();
            if(ans != -999.0){
                nums.add(ans);
            }
            else
                break;
        }
        
        div = nums.get(0);
        
        for(int i = 1; i<nums.size(); i++){
            //if(nums.get(i) != sub){
                div /= nums.get(i);
            //}
        }
        
        return div;
    }
    
    public Double multiply(){
        ArrayList<Double> nums = new ArrayList();
        
        Double mul;
        Double ans = 0.0;
        Scanner in = new Scanner(System.in);
        
        while(ans != -999.0){
            System.out.println("Write a number to be added and press -999 to end.(Use the first number as a base number to be subtracted)\n");
            ans = in.nextDouble();
            if(ans != -999.0){
                nums.add(ans);
            }
            else
                break;
        }
        
        mul = nums.get(0);
        
        /*for(int i = 1; i<nums.size(); i++){
            if(sub<nums.get(i)){
                Double temp = sub;
                sub=nums.get(i);
                nums.set(i,sub);
            }
        }*/
        
        for(int i = 1; i<nums.size(); i++){
            //if(nums.get(i) != sub){
                mul *= nums.get(i);
            //}
        }
        
        return mul;
    }
    
    public Double reminder(){
        ArrayList<Double> nums = new ArrayList();
        
        Double rem;
        Double ans = 0.0;
        Scanner in = new Scanner(System.in);
        
        while(ans != -999.0){
            System.out.println("Write a number to be added and press -999 to end.(Use the first number as a base number to be subtracted)\n");
            ans = in.nextDouble();
            if(ans != -999.0){
                nums.add(ans);
            }
            else
                break;
        }
        
        rem = nums.get(0);
        
        /*for(int i = 1; i<nums.size(); i++){
            if(sub<nums.get(i)){
                Double temp = sub;
                sub=nums.get(i);
                nums.set(i,sub);
            }
        }*/
        
        for(int i = 1; i<nums.size(); i++){

                rem %= nums.get(i);

        }
        
        return rem;
    }
    
    public Double powerNum(){
        ArrayList<Double> nums = new ArrayList();
        
        Double power;
        Double ans = 0.0;
        Scanner in = new Scanner(System.in);
        
        while(ans != -999.0){
            System.out.println("Write a number to be added and press -999 to end.(Use the first number as a base number to be subtracted)\n");
            ans = in.nextDouble();
            if(ans != -999.0){
                nums.add(ans);
            }
            else
                break;
        }
        
        power = nums.get(0);
        
        
        for(int i = 1; i<nums.size(); i++){

                power = Math.pow(power, nums.get(i));

        }
        
        return power;
    }
    
    public Double squareBinomial(){
        Double v1 = 0.0;
        Double v2  = 0.0;

        Scanner in = new Scanner(System.in);
        
       System.out.println("Write the first variable");
       v1 = in.nextDouble();
       
       System.out.println("Write the second variable");
       v2 = in.nextDouble();
       
       Double sBinomial = Math.pow(v1, 2) + Math.pow(v2, 2) + 2*v1*v2;
       
       return sBinomial;
        
    }
    
    public Double cubedBinomial(){
        
        Double v1 = 0.0;
        Double v2  = 0.0;
        Scanner in = new Scanner(System.in);
        
       System.out.println("Write the first variable");
       v1 = in.nextDouble();
       
       System.out.println("Write the second variable");
       v2 = in.nextDouble();
       
       Double cBinomial = Math.pow(v1, 3) + Math.pow(v2, 3) + 3*(Math.pow(v1, 2))*v2 + 3*(Math.pow(v2, 2))*v1;
        return cBinomial;
    }
    
    public Double heronFormula(){
        Double area = 0.0;
        Double v1 = 0.0;
        Double v2  = 0.0;
        Double v3 = 0.0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Write the first length's value of the triangle ");
       v1 = in.nextDouble();
       
       System.out.println("Write the second length's value of the triangle");
       v2 = in.nextDouble();
       
       System.out.println("Write the third length's value of the triangle");
       v3 = in.nextDouble();
       
       Double semiPerimeter = (v1+v2+v3)/2;
       
       Double inSqrt = semiPerimeter*(semiPerimeter-v1)*(semiPerimeter-v2)*(semiPerimeter-v3);
        
       area = Math.sqrt(inSqrt);
        
        return area;
    }
}
