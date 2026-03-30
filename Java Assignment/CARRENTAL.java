import java.util.*;
class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;
    void GetCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car ID:");
        CarId = sc.nextInt();
        System.out.println("Enter Car Type:");
        CarType = sc.next();
    }
    float GetRent() {
        if(CarType.equalsIgnoreCase("Small"))
            Rent = 1000;
        else if(CarType.equalsIgnoreCase("Van"))
            Rent = 800;
        else if(CarType.equalsIgnoreCase("SUV"))
            Rent = 2500;
        return Rent;
    }
    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + GetRent());
    }
    public static void main(String args[]) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar();
        c.ShowCar();
    }
}
