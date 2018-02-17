package triangleex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangles tri = new Triangles();
        System.out.println("Triangle exercise start");

//        Used for the Netbeans IDE or whatever IDE you are using.
//        Scanner scan = new Scanner(System.in);
//        switch (scan.nextLine()) {
//            case "Eq":
//                System.out.println(tri.triangleSides(9, 9, 9));
//                break;
//            case "Iso":
//                System.out.println(tri.triangleSides(9, 7, 9));
//                break;
//            case "Sca":
//                System.out.println(tri.triangleSides(9, 7, 6));
//                break;
//            default:
//                System.out.println("Error, no viable triangles");
//        }
        
//        Used if you want to run it from the command line.
        String Args;
        if (args.length > 0) {
            try {
                Args = tri.triangleSides(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                
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
