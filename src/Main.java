import java.util.*;

public class Main {
    public static void main(String args[]) {
        java.util.Scanner myScanner = new java.util.Scanner(System.in);
        int L= myScanner.nextInt();
        int W = myScanner.nextInt();
        int R = myScanner.nextInt();
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = myScanner.nextInt();
        int RS = myScanner.nextInt();
        int DR = myScanner.nextInt();
        int HR = myScanner.nextInt();
        int WR = myScanner.nextInt();
        int HC = myScanner.nextInt();
        int RC = myScanner.nextInt();


        double PR = 2*(L + W);
        double AR = L*W;
        double C = 2*(3.14)*R;
        double AC = (3.14)*(R*R);
        double PT = a + b + c;
        double S = PT/2;
        double AT = Math.sqrt((S)*(S-a)*(S-b)*(S-c));

        double SAS = 4*(3.14)*(RS*RS);
        double VS = 3.14*4/3*RS*RS*RS;
        double SAR = 2*DR*HR+2*HR*WR+2*DR*WR;
        double VR = DR*HR*WR;
        double SAC = 2*(3.14)*(RC*RC)+ 2*(3.14)*RC*HC;
        double VC = HC*(3.14)*(RC*RC);

        System.out.println("Enter length of rectangle (positive integer):");
        System.out.println("Enter width of rectangle (positive integer):");
        System.out.println("Now enter the radius of the circle (positive integer):");
        System.out.println("Enter side A of triangle (positive integer):");
        System.out.println("Enter side B of triangle (positive integer):");
        System.out.println("Enter side C of triangle (positive integer):");

        System.out.println("Area of rectangle: " + AR);
        System.out.println("Area of circle: " + AC);
        System.out.println("Perimeter of rectangle: " + PR);
        System.out.println("Circumference of circle: " + C);
        System.out.println("Area of Triangle: " + AT);
        System.out.println("Perimeter of Triangle: " + PT);

        System.out.println("Enter the radius of the sphere:");
        System.out.println("Enter the diameter of the rectangular prism:");
        System.out.println("Enter the height of the rectangular prism:");
        System.out.println("Enter the width of the rectangular prism:");
        System.out.println("Enter the height of the cylinder:");
        System.out.println("Enter the radius of the cylinder:");

        System.out.println("The surface area of the sphere is: " + SAS);
        System.out.println("The volume of the sphere is: " + VS);
        System.out.println("The surface area of the rectangular prism is: " + SAR);
        System.out.println("The volume of the rectangular prism is: " + VR);
        System.out.println("The surface area of the cylinder is: " + SAC);
        System.out.println("The volume of the cylinder is: " + VC);

    }
}
