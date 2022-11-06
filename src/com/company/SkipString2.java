package com.company;

public class SkipString2 {
    public static void main(String[] args) {
        String str= " sdkfhjHarishdiofdif";
        System.out.println(Remove(str));
    }

    public static String Remove(String str1){
        //base case
        if(str1.isEmpty()){
            return "";
        }
        if(str1.startsWith("Har") && !str1.startsWith("Harsh")){
            return Remove(str1.substring(3));
        }else{
            return str1.charAt(0)+Remove(str1.substring(1));
        }

    }
}
