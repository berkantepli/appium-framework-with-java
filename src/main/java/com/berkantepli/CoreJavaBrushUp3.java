package com.berkantepli;

public class CoreJavaBrushUp3 {
    public static void main(String[] args) {

        //string is an object //String literal
        
        //String s1 = "Berk Antepli";
        String s5 = "hello";

        //new
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s = "Berk Antepli berkantepli";
        String[] splittedString = s.split("Antepli");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        //System.out.println(splittedString[2]);
        System.out.println(splittedString[1].trim());
        
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        
        for(int i = s.length()-1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
}
