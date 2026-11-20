import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int count = sc.nextInt();
        sc.nextLine();
        if (count <= 0) {
            System.out.println("No students entered.");
            sc.close();
            return;
        }
        String[] names = new String[count];
        int[] marks = new int[count];
        for (int i = 0; i < count; i++) { // Taking student details
            System.out.print("Enter student " + (i + 1) + " name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter student " + (i + 1) + " marks (0-100): ");
            marks[i] = sc.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {  // Marks validation
                System.out.print("Invalid! Enter marks (0-100): ");
                marks[i] = sc.nextInt();
            }
            sc.nextLine();
        }
        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        for (int i = 0; i < count; i++) {
            total += marks[i];
            if (marks[i] > highest) { // Calculating total, highest and lowest marks
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        double average = (double) total / count;
        System.out.println("\n*** CLASS STATISTICS ***");
        System.out.println("Total students: " + count);
        System.out.println("Average marks: "+ average);
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
        System.out.println("\n*** TOPPER(S) ***");//topper list
        for (int i = 0; i < count; i++) {
            if (marks[i] == highest) {
                System.out.println(" "+ names[i]);
            }
        }
        for (int i = 0; i < count - 1; i++) {  // Sorting highest to lowest
            for (int j = i + 1; j < count; j++) {
                if (marks[i] < marks[j]) {
                    int tempM = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempM;
                    String tempN = names[i];
                    names[i] = names[j];
                    names[j] = tempN;
                }
            }
        }
        System.out.println("\n*** RANK LIST ***");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + marks[i]); // Displaying rank list
        }
        sc.close();
    }
}
