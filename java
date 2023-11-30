import java.util.Scanner;

public class AreaCalculator {
    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate the area of a circle
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        double circleArea = calculateArea(circleRadius);
        System.out.println("Area of the circle: " + circleArea);

        // Calculate the area of a triangle
        System.out.print("Enter the base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        double triangleArea = calculateArea(triangleBase, triangleHeight);
        System.out.println("Area of the triangle: " + triangleArea);

        scanner.close();
    }
}
