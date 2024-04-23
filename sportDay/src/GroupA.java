import java.util.HashMap;
public class GroupA extends SuperClass {
    private String[] groupAArray;
    private HashMap<String, Integer> points;
    private HashMap<String, Integer> points1;

    public GroupA() {
        groupAArray = new String[]{"salma", "mohammed", "mustafa", "emman", "khadiga"};
        points1 = new HashMap<>();
        points1.put("salma",13);
        points1.put("mohammed",15);
        points1.put("mustafa",19);
        points1.put("emman",20);
        points1.put("khadiga",13);

        superArray = new String[]{"Football", "Basketball", "Tennis", "Swimming", "Handball"};
        points = new HashMap<>();
        points.put("Football", 10);
        points.put("Basketball", 8);
        points.put("Tennis", 6);
        points.put("Swimming", 12);
        points.put("handball", 15);
    }

    public void display() {
        System.out.println("sports :");
        for (String s : superArray) {
            System.out.println(s);
        }
    }

    public boolean isInGroup(String name) {
        for (String s : groupAArray) {
            if (s.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int getPoints(String sport ) {
        return points.getOrDefault(sport, 0);
    }
    public int getEmpPoints(String name ) {
        return points1.getOrDefault(name, 0);
    }
}