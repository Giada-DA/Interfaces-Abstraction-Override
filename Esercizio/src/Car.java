public class Car extends AbstractVehicle{
    public int numberOfDoors;
    public double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The vehicle has " + numberOfDoors + " doors");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Bruuummmm");
    }

    public Car(int numberOfWheels, int numberOfDoors, double carPrice){
        this.type = "Car";
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

}
