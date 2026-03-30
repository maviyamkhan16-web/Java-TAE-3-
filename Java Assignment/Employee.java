import java.util.*;

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empno name basic hra da");
        empno = sc.nextInt();
        ename = sc.next();
        basic = sc.nextFloat();
        hra = sc.nextFloat();
        da = sc.nextFloat();

        netpay = calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }

    public static void main(String args[]) {
        Employee e = new Employee();
        e.havedata();
        e.dispdata();
    }
}
