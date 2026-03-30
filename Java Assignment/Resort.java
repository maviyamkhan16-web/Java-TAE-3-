import java.util.*;

class Resort {
    int RNo, Days;
    String Name;
    float Charges;

    float Compute() {
        float amount = Days * Charges;
        if(amount > 11000)
            amount = (float)(1.02 * amount);
        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Room No:");
        RNo = sc.nextInt();
        System.out.println("Enter Name:");
        Name = sc.next();
        System.out.println("Enter Charges:");
        Charges = sc.nextFloat();
        System.out.println("Enter Days:");
        Days = sc.nextInt();
    }

    void DispInfo() {
        System.out.println(RNo + " " + Name + " " + Charges + " " + Days + " " + Compute());
    }

    public static void main(String args[]) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}
