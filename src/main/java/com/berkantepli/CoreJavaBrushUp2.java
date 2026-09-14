package com.berkantepli;
import java.util.ArrayList;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};

        //2,4,6,8,10,122

        //check if array has multiple of 2

        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                break;
            }
            else {
                System.out.println(arr2[i] + " is not a multiple of 2");
            }
        }

        ArrayList<String> a = new ArrayList();
        a.add("berk");
        a.add("antepli");
        a.add("berkantepli");
        //a.remove(2);
        //a.get(2);
        System.out.println(a.get(2));

        //create object of the class - object.method
    }
}
