package Balance;

public class Account {
    double p, i, r, balance;
    int t;

    public Account(double pr, int ti, double ra) {
        p = pr;
        t = ti;
        r = ra;
    }

    public void cal() {
        balance = p * r * t;
    }

    public void Disply_Balance() {
        System.out.println(
                "\n\nPrincipal Amount: " + p + "Rs\nTime:" + t + "Years\n\nCurrent Balance: " + balance + "Rs");
    }
}
