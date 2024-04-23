import java.util.HashMap;
public class GroupB extends SuperClass {
    private String[] groupBArray;
    private HashMap<String, Integer> points;
    private HashMap<String, Integer> points1;


    public GroupB() {
        groupBArray = new String[]{"sara", "maryam", "sleem", "omar", "lina"};
        points1 = new HashMap<>();
        points1.put("sara",13);
        points1.put("maryam",15);
        points1.put("sleem",19);
        points1.put("omar",20);
        points1.put("lina",13);
        superArray = new String[]{"Football", "Basketball", "Tennis", "Swimming", "Handball"};
        points = new HashMap<>();
        points.put("Football", 20);
        points.put("Basketball", 10);
        points.put("Tennis", 11);
        points.put("Swimming", 19);
        points.put("handball", 23);
    }

//    public void display() {
//        System.out.println("sports :");
//        for (String s : superArray) {
//            System.out.println(s);
//        }
//    }

    public boolean isInGroup(String name) {
        for (String s : groupBArray) {
            if (s.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int getPoints(String sport) {
        return points.getOrDefault(sport, 0);
    }
    public int getEmpPoints(String name ) {
        return points1.getOrDefault(name, 0);
    }
}
