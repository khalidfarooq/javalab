
class Player {
    String name;
    int age;

    Player(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Player name: " + name);
        System.out.println("Age: " + age);
    }
}

class Cricket_Player extends Player {
    String type;

    Cricket_Player(String n, int a, String t) {
        super(n, a);
        type = t;
    }

    public void show() {
        super.show();
        System.out.println("type: " + type);
    }
}

class Football_Player extends Player {
    String type;

    Football_Player(String n, int a, String t) {
        super(n, a);
        type = t;
    }

    public void show() {
        super.show();
        System.out.println("type: " + type);
    }
}

class Hockey_Player extends Player {
    String type;

    Hockey_Player(String n, int a, String t) {
        super(n, a);
        type = t;
    }

    public void show() {
        super.show();
        System.out.println("type: " + type);
    }
}

public class third {
    public static void main(String args[]) {
        Cricket_Player c = new Cricket_Player("khalid", 21, "cricket");
        Football_Player f = new Football_Player("aman", 20, "football");
        Hockey_Player h = new Hockey_Player("navdeep", 19, "hockey");

        c.show();
        f.show();
        h.show();
    }
}
