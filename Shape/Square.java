package Shape;

import Color.Color;

public class Square implements Color {
    double side;

    @Override
    public void color() {
        System.out.println("Color 4 sides.");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }
}
