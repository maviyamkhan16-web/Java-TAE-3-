import java.util.*;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.equals(name2))
            System.out.println("Same (Case-Sensitive)");
        else
            System.out.println("Different (Case-Sensitive)");

        if (name1.equalsIgnoreCase(name2))
            System.out.println("Same (Case-Insensitive)");
        else
            System.out.println("Different (Case-Insensitive)");
    }
}
