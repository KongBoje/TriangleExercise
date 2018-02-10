/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleex;

import java.util.Scanner;

/**
 *
 * @author Micha
 */
public class Main {

    public static String triangles(int A, int B, int C) {
        Boolean Triangle = A > 0 && B > 0 && C > 0;
        Boolean EqTri = A == B && A == C && B == C;
        Boolean IsoTri = A == B || A == C || B == C;

        if (Triangle) {
            if (EqTri) {
                System.out.println("You got an Equiliteral Triangle");
            } else if (IsoTri) {
                System.out.println("You got an Isosceles Triangle");
            } else {
                System.out.println("You got a Scalene Triangle");
            }
        }
        return "Impossible, sides must be above 0";
    }

    public static void main(String[] args) {
        System.out.println("Triangle exercise start");

//        Used for the Netbeans IDE or whatever IDE you are using.
//        Scanner scan = new Scanner(System.in);
//        switch (scan.nextLine()) {
//            case "Eq":
//                System.out.println(triangles(9, 9, 9));
//                break;
//            case "Iso":
//                System.out.println(triangles(9, 7, 9));
//                break;
//            case "Sca":
//                System.out.println(triangles(9, 7, 6));
//                break;
//            default:
//                System.out.println("Error, no viable triangles");
//        }
        
//        Used if you want to run it from the command line.
        String Args;
        if (args.length > 0) {
            try {
                Args = triangles(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                
                System.out.println(Args);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + args[1] + args[2] + " must be an integer." + e);
                System.exit(1);
            }
        }
        // Run it by going into the src folder.
        // then type javac triangleex/Main.java
        // Then run the program with "java triangleex/Main 1 1 1" for instance.
        // Program should work.
    }
}
