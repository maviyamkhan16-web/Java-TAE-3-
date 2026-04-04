abstract class Employee {
    String name;
    int id;
    double salary;

    abstract double calculateBonus();
}

class Manager extends Employee {
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double calculateBonus() {
        return salary * 0.10 + 5000;
    }
}
