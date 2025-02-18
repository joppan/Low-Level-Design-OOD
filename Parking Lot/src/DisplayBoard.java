public class DisplayBoard {
    // Data members
    private int id;
    private Map<String, List<ParkingSpot>> parkingSpots;

    // Constructor
    public DisplayBoard(int id) {
        this.id = id;
        this.parkingSpots = new HashMap<>();
    }

    // Member function
    public void addParkingSpot(String spotType, List<ParkingSpot> spots);
    public void showFreeSlot();
}