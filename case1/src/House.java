public class House extends Structure {

    private int floorCount;


    public House(int price, int area, int roomCount, int hallCount, int floorCount) {
        super(price, area, roomCount, hallCount);
        this.floorCount = floorCount;
    }
    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
}
