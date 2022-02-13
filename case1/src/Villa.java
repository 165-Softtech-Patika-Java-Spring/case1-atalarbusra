public class Villa extends Structure {

    private int poolCount;

    public Villa(int price, int area, int roomCount, int hallCount, int poolCount) {
        super(price, area, roomCount, hallCount);
        this.poolCount = poolCount;
    }

    public int getPoolCount() {
        return poolCount;
    }

    public void setPoolCount(int poolCount) {
        this.poolCount = poolCount;
    }
}
