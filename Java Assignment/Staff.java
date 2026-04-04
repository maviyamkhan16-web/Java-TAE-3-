class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treating patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assisting doctor");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist managing appointments");
    }
}
