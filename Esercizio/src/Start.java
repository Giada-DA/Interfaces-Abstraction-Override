public class Start {
    public static void main(String[] args) {
        Car daciaSandero = new Car(4, 4, 11.700);
        Boat barcaVela = new Boat(59.23, 115);

        System.out.println("--------------------------");
        System.out.println("Car details and sound:");
        daciaSandero.showVehicleDetails();
        daciaSandero.doVehicleSound();

        System.out.println("--------------------------");
        System.out.println("Boat details and sound:");
        barcaVela.showVehicleDetails();
        barcaVela.doVehicleSound();

        System.out.println("--------------------------");
        System.out.println("Boat weight and speed:");
        barcaVela.getBoatWeightAndSpeed();
    }
}
