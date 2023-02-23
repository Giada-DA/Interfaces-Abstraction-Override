public class Boat extends AbstractVehicle{
    public double maxKnotsSpeed;
    public int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("Squashh");
    }

    public Boat(double maxKnotsSpeed, int boatKilosWeight){
        this.type = "Boat";
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    public String getBoatWeightAndSpeed(){
        return "The total weight: " + boatKilosWeight + "kg, and the maximum speed: " + maxKnotsSpeed;
    }
}
