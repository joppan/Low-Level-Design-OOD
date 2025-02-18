public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree();
    public abstract boolean assignVehicle(Vehicle vehicle);
    public boolean removeVehicle(){
        // definition
    }
}