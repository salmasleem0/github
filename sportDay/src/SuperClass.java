
public class SuperClass {
    protected String[] superArray;

    public SuperClass() {
        superArray = new String[5];
    }

    public void display() {
        System.out.println("SuperClass Array:");
        for (String s : superArray) {
            System.out.println(s);
        }
    }
}