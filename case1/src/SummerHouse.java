public class SummerHouse extends Structure {

    private int gardenArea;

    public SummerHouse(int price, int area, int roomCount, int hallCount, int gardenArea) {
        super(price, area, roomCount, hallCount);
        this.gardenArea = gardenArea;
    }

    public int getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }
}
