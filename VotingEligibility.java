package org.example;

public class VotingEligibility {
    //To check if a candidate is eligible to vote or not
    public static void main(String[] args){
        int age = 14;
        if (age>=16){
            System.out.println("Eligible to vote.");
        }else{
            System.out.println("Not eligible to vote.");
        }
    }
}
