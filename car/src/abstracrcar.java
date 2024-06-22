public abstract class abstracrcar implements inter{
    String make;
    String model;
    int year;
    boolean isrented;
    public abstracrcar( String make ,String model,int year ){
        this.make=make;
        this.model=model;
        this.year=year;

    }

    @Override
    public void rent() {
        if(isrented==true) {
            System.out.println("car is rented");
        }
    }

    @Override
    public void returncar() {
        if(isrented==false) System.out.println("car is available");
    }

    @Override
    public boolean isrented() {
        return isrented;
    }
    public abstract void caclrentalcost(int days);
}
