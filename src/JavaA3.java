import java.util.ArrayList;
import java.util.Scanner;
public class JavaA3 {
    static Scanner sc = new Scanner(System.in);
    static int readNumber(String message, int min, int max) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Please enter a number from " + min + " to " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid number. Try again.");
            }
        }
    }
    static String readName(String message) {
        while (true) {
            System.out.print(message);
            String name = sc.nextLine().trim();
            if (!name.isEmpty()) {
                return name;
            }
            System.out.println("Name cannot be empty.");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        int count = readNumber("How many students? ", 0, 1000);
        if (count == 0) {
            System.out.println("No students entered, so there are no statistics to show.");
            return;
        }
        for (int i = 1; i <= count; i++) {
            names.add(readName("Student " + i + " name: "));
            marks.add(readNumber("Student " + i + " marks (0-100): ", 0, 100));
        }
        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);
        for (int m : marks) {
            total += m;
            if (m > highest) highest = m;
            if (m < lowest) lowest = m;
        }
        double average = (double) total / marks.size();
        System.out.println("\n***** CLASS STATISTICS ******");
        System.out.printf("Total students : %d%n", marks.size());
        System.out.printf("Average marks  : %.2f%n", average);
        System.out.println("Highest marks  : " + highest);
        System.out.println("Lowest marks   : " + lowest);

        System.out.println("\nTopper(s) with " + highest + " marks:");
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) == highest) {
                System.out.println(" - " + names.get(i));
            }
        }
        // bubble sort (highest marks first), swapping names and marks together
        for (int i = 0; i < marks.size() - 1; i++) {
            for (int j = 0; j < marks.size() - 1 - i; j++) {
                if (marks.get(j) < marks.get(j + 1)) {
                    int tempMark = marks.get(j);
                    marks.set(j, marks.get(j + 1));
                    marks.set(j + 1, tempMark);
                    String tempName = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, tempName);
                }
            }
        }
        System.out.println("\n******** RANK LIST *********");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i) + " - " + marks.get(i));
        }
    }
}
