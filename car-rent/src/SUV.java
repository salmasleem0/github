public class SUV extends abstractcar {
    private int day;
    private int week;

    public SUV(String make, String model, int year) {
        super(make, model, year);
        this.day = 2000;
        this.week = 9000;
    }

    @Override
    public double calccost(int days) {
        if (days < 7)
            return days * day;
        else {
            return week * (days / 7) + day * (days % 7);
        }
    }
}