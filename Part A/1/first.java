import java.io.*;
import java.util.*;

class Rectangle {
    double len, wid, area;
    String color;

    Scanner sc = new Scanner(System.in);

    Rectangle() {
        len = wid = area = 0;
        color = "Null";
    }

    void set_len() {
        System.out.println("Enter Length");
        len = sc.nextDouble();
    }

    void set_width() {
        System.out.println("Enter Width");
        wid = sc.nextDouble();
    }

    void set_color() {
        System.out.println("Enter Color");
        color = sc.next();
    }

    void find_area() {
        area = len * wid;
        System.out.println("Area of rectangle : " + area);
    }

}

public class first {

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        System.out.println("First Rectangle: \n\n");
        r1.set_len();
        r1.set_width();
        r1.set_color();
        r1.find_area();

        Rectangle r2 = new Rectangle();
        System.out.println("Second Rectangle: \n\n");
        r2.set_len();
        r2.set_width();
        r2.set_color();
        r2.find_area();

        if (r1.color.equals(r2.color) && r1.area == r2.area) {
            System.out.println("\n\nMatching Rectangles");
        } else {
            System.out.println("\n\nNon Matching Rectangles");
        }
    }
}