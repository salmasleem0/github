public class sedan extends abstractcar{
    private int day;
    private int week;
    public sedan(String make, String model, int year) {
        super(make, model, year);
        this.day=1000;
        this.week=7000;
    }

    @Override
    public double calccost(int days) {
        if (days<7)
            return days*day;
        else {
            return week*(days/7)+day*(days%7);
        }
    }
}
