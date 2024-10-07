class Point2D {
    int x, y;

    Point2D() {
        this.x = 5; 
        this.y = 10; 
    }

    void display() {
        System.out.println("The coordinates are:(" + x + "," + y + ")");
    }
}

class Point3D extends Point2D {
    int z = 15;

    void display() {
        System.out.println("The coordinates are:(" + x + "," + y + "," + z + ")");
    }
}

public class Main {
    public static void main(String args[]) {
        Point2D obj1 = new Point2D();
        Point3D obj2 = new Point3D();
        Point2D obj3 = new Point3D();

        obj1.display(); 
        obj2.display(); 
        obj3.display(); 
    }
}
