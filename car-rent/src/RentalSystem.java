class RentalSystem {
    private SUV suvCar;
    private sedan sedanCar;

    public RentalSystem(SUV suvCar, sedan sedanCar) {
        this.suvCar = suvCar;
        this.sedanCar = sedanCar;
    }

    public void rentCar(int carType) {
        if (carType == 1) {
            suvCar.getrent();
        } else if (carType == 2) {
            sedanCar.getrent();
        } else {
            System.out.println("Invalid car type.");
        }
    }

    public void returnCar(int carType) {
        if (carType == 1) {
            suvCar.getreturnCAR();
        } else if (carType == 2) {
            sedanCar.getreturnCAR();
        } else {
            System.out.println("Invalid car type.");
        }
    }

    public void checkCarStatus(int carType) {
        if (carType == 1) {
            System.out.println("Is the SUV rented? " + suvCar.getisrented());
        } else if (carType == 2) {
            System.out.println("Is the Sedan rented? " + sedanCar.getisrented());
        } else {
            System.out.println("Invalid car type.");
        }
    }

    public void calculateRentalCost(int carType, int days) {
        if (carType == 1) {
            double cost = suvCar.calccost(days);
            System.out.println("Cost to rent SUV for " + days + " days: " + cost);
        } else if (carType == 2) {
            double cost = sedanCar.calccost(days);
            System.out.println("Cost to rent Sedan for " + days + " days: " + cost);
        } else {
            System.out.println("Invalid car type.");
        }
    }
}