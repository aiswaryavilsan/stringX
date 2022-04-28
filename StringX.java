package com.learn;

public class StringX {
    static String stringA = "first string";
    static String stringB = "second string";

    public static void main(String[] args) {
        System.out.println(stringA + "," + stringB);

        if(stringA.length()==stringB.length()){
            System.out.println(String.join(stringA,stringB));
        }else if(stringA.length()<stringB.length()){
            System.out.println(stringB.substring(stringB.length()-stringA.length()));
        }
        else if(stringA.length()>stringB.length()){
            System.out.println(stringA.substring(stringA.length()-stringB.length()));
        }

    }
}