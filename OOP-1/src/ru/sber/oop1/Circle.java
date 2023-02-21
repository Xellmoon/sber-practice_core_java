package ru.sber.oop1;
public class Circle {
    int radius;
    String color;
    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public int circleS() {
        int s = (int) Math.floor(3.14 * radius * radius) ;
        return s;
    }
    public int circleP() {
        int p = (int) Math.floor(2 * 3.14 * radius) ;
        return p;
    }

    public String toString() {
        return "Circle{"
                + "Радиус='" + radius + '\''
                + ", Цвет=" + color
                + ", Площадь=" + circleS()
                + ", Периметр=" + circleP()
                + '}';
    }
}
