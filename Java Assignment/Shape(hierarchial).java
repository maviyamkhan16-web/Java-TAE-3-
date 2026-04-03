class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of circle: " + (3.14*5*5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of rectangle: " + (4*6));
    }

    public static void main(String args[]) {
        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}
