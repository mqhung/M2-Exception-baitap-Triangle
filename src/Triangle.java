import java.util.EmptyStackException;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle() {
    }

    public Triangle(int firstSide, int secondSide, int thirdSide) throws IllegalTriangleException {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0){
            throw new IllegalTriangleException("Side is negative.");
        } else if (firstSide + secondSide < thirdSide || firstSide + thirdSide < secondSide || secondSide + thirdSide < firstSide) {
            throw new IllegalTriangleException("Not Triangle");
        } else {
            throw new IllegalTriangleException("Is Triangle");
        }
    }
}
