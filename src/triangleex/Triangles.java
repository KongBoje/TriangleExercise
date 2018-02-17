/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleex;

/**
 *
 * @author Micha
 */
public class Triangles {
    
    public String triangleSides(int A, int B, int C) {
        Boolean Triangle = A > 0 && B > 0 && C > 0;
        Boolean EqTri = A == B && A == C && B == C;
        Boolean IsoTri = A == B || A == C || B == C;

        if (Triangle) {
            if (EqTri) {
                System.out.println("You got an Equiliteral Triangle");
                return "You got an Equiliteral Triangle";
            } else if (IsoTri) {
                System.out.println("You got an Isosceles Triangle");
                return "You got an Isosceles Triangle";
            } else {
                System.out.println("You got a Scalene Triangle");
                return "You got a Scalene Triangle";
            }
        }
        System.out.println("Not a valid triangle");
        return "Not a valid triangle";
    }
}
