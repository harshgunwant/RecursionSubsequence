package com.company;

public class Main {

    public static void main(String[] args) {
        //strings - subsequence
        String str="baccada";
        //RemoveAs("",str);
        String good=Strii(str);
        System.out.println(good);
	// write your code here
    }

    //when we are printing at the last step of recursion
    public static void RemoveAs(String proc, String unproc){
        //without using recursion
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch=unproc.charAt(0);

        if(ch=='a'){
            //skip
            RemoveAs(proc, unproc.substring(1));
        }else{
            RemoveAs(proc+ch, unproc.substring(1));
        }

    }

    //when we waant to pass just one string and make changes
    //we want it to return the resultant string at every step.
    public static String Strii(String str1){
        //base case
         if(str1.isEmpty()) return "";

        char ch=str1.charAt(0);
        if(ch=='a'){
            return Strii(str1.substring(1));
        }else{
            return ch+Strii(str1.substring(1));
        }
    }
}
