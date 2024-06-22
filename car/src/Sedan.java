public class Sedan extends abstracrcar{
    private int dailyrait;
    private int weeklyrait;

    public Sedan(String make, String model, int year) {
        super(make, model, year);
        this.dailyrait = 2000;
        this.weeklyrait=14000;
    }

    @Override
    public void caclrentalcost(int days) {
        int weeks = days / 7;
        int remainingDays = days % 7;
        int totalCost = (weeks * weeklyrait) + (remainingDays * dailyrait);
        System.out.println( "totalcost is: "+totalCost);
    }
}

