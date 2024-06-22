public class SUV extends abstracrcar{
    private int dailyrait;
    private int weeklyrait;

    public SUV(String make, String model, int year) {
        super(make, model, year);
        this.dailyrait = 1000;
        this.weeklyrait=7000;
    }

    @Override
    public void caclrentalcost(int days) {
        int weeks = days / 7;
        int remainingDays = days % 7;
        int totalCost = (weeks * weeklyrait) + (remainingDays * dailyrait);
        System.out.println("total cost is: "+totalCost);
    }
}

