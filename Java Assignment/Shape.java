abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("Shape Information");
    }
}

class Circle extends Shape {
    void calculate_area() {
        double area = 3.14 * 5 * 5;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    void calculate_area() {
        int area = 5 * 4;
        System.out.println("Rectangle Area: " + area);
    }

    public static void main(String args[]) {
        Shape c = new Circle();
        c.display_info();
        c.calculate_area();

        Shape r = new Rectangle();
        r.calculate_area();
    }
}
