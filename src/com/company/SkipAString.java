package com.company;

public class SkipAString {
    public static void main(String[] args) {
        String str="dhuhsauhlesdgappleesd";
        System.out.println(ResolveThis(str));
    }
    public static String ResolveThis(String str){
        //base case
        if(str.isEmpty()) return "";

        if(str.startsWith("apple")){
            return ResolveThis(str.substring(5));
        }else{
            return str.charAt(0)+ResolveThis(str.substring(1));
        }
    }
}
