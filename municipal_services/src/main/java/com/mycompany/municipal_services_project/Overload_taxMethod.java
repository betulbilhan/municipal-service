/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bp2_p1;

//this class is write to using in sport_INQ frame. It used for give the info of tax.
public class Overload_taxMethod {
    public static String s(String age){
        int r=Integer.parseInt(age)*10;
        return "Since you are "+age+" years old, the tax you have to pay is "+age+"*10="+r;
    }
    public static String s(String age,String name){
        int r=Integer.parseInt(age)*10;
        return "Dear "+name+", since you are "+age+" years old, the tax you have to pay is "+age+"*10="+r;
    }
    
    
}
