abstract class abstractcar implements first {
    private String make;
    private String model;
    private int year;
    private boolean rented;
    public abstractcar (String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
        this.rented=false;
    }
    @Override
    public void getrent() {
        if (!rented){
            rented=true;
            System.out.println("car rented"+ make+" "+model+" "+year);
        }

    }
    public void getreturnCAR(){
        if (rented){
            rented=false;
            System.out.println("car is available"+ make+" "+model+" "+year);
        }
     }

    @Override
    public boolean getisrented() {
        return rented;
    }
    public abstract double calccost(int days);
}
