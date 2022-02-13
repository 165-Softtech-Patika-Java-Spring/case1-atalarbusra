public class Structure {

    private int price;
    private int area;
    private int roomCount;
    private int hallCount;

    public Structure(int price, int area, int roomCount, int hallCount) {
        this.price = price;
        this.area = area;
        this.roomCount = roomCount;
        this.hallCount = hallCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getHallCount() {
        return hallCount;
    }

    public void setHallCount(int hallCount) {
        this.hallCount = hallCount;
    }
}
