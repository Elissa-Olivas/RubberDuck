package com.company;

public class Main {

    public static void main(String[] args) {
        String question= "How many rubber ducks does it take to clog the ocean?";
        int charQuestion= 53;
        int charAmt= 100;
        int charAmt2= 300;

        if (charQuestion < charAmt) {
            System.out.println("Ask a better question!");
        } else if (charQuestion > charAmt2) {
            System.out.println("Simplify your question");
        } else {
            System.out.print("Your sentence is just right!");
        }
    }
}
