import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter first side:");
            int firstSide = Integer.parseInt(sc.nextLine());
            System.out.println("Enter second side:");
            int secondSide = Integer.parseInt(sc.nextLine());
            System.out.println("Enter third side:");
            int thirdSide = Integer.parseInt(sc.nextLine());
            try {
                Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}