import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GroupA groupA = new GroupA();
        GroupB groupB = new GroupB();
        groupA.display();
 
        System.out.println("enter your name:");
        String name = scanner.nextLine();

        if (groupA.isInGroup(name)) {
            System.out.println(name + " is in Group A.");
            int points1 = groupA.getEmpPoints(name);
            System.out.println(" name:  " + name + " emp points " + points1);
            System.out.println("enter a sport:");
            String sport = scanner.nextLine();
            int points = groupA.getPoints(sport);

            System.out.println("Points for " + sport + " in Group A: " + points);
        } else if (groupB.isInGroup(name)) {
            System.out.println(name + " is in Group B.");
            int points1 = groupB.getEmpPoints(name);
            System.out.println(" name:  " + name + " points " + points1);
            System.out.println("Enter a sport:");
            String sport = scanner.nextLine();
            int points = groupB.getPoints(sport);
            System.out.println("Points for " + sport + " in Group B: " + points);
        } else {
            System.out.println(name + " is not in any group.");
        }
    }
}