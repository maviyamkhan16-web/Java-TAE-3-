class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String n, int i) {
        name = n;
        id = i;
        employeeCount++;
    }

    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String args[]) {
        new Employee("Ali",1);
        new Employee("Sara",2);
        new Employee("John",3);

        showCount();
    }
}
