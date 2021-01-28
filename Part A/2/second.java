
//constructor Overloading
class Box {
    double width, height, depth;

    // constructor used when all dimensions
    // specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // cube
    Box(double len) {
        width = height = depth = len;
    }

    Box() {
        width = height = depth = 0;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

}

// method overloading
class Adder {
    int res;

    Adder() {
        res = 0;
    }

    void add(int a, int b, int c) {
        res = a + b + c;
        System.out.println("ADDING :" + res);
    }

    void add(int a, int b) {
        res = a + b;
        System.out.println("ADDING :" + res);
    }
}

public class second {

    public static void main(String args[]) {
        Box b1 = new Box(1, 2, 3);
        Box b2 = new Box();
        Box b3 = new Box(2);

        System.out.println(" Volume of b1 is " + b1.volume());
        System.out.println(" Volume of b2 is " + b2.volume());
        System.out.println(" Volume of b3 is " + b3.volume());

        Adder a1 = new Adder();
        a1.add(1, 2, 3);
        a1.add(1, 2);
    }
}
