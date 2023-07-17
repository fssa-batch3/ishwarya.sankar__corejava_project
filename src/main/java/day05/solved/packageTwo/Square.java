package day05.solved.packageTwo;

import day05.solved.packageOne.Rectangle;

public class Square extends Rectangle {

    public Square(double sideLength) throws Exception {
        super(sideLength, sideLength);

    }

    public static void main(String[] args) {
        try {
            Square square = new Square(1.0);
            System.out.println(square.numberOfSides);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
