import java.util.ArrayList;
import java.util.List;

public class Structers {

    private House house1 = new House(10000,220,4,3,1);
    private House house2 = new House(40000,200,4,2,1);
    private House house3 = new House(30000,230,3,3,1);

    private Villa villa1 = new Villa(80000,450,9,3,1);
    private Villa villa2 = new Villa(74000,400,7,4,1);
    private Villa villa3 = new Villa(90000,500,10,3,2);

    private SummerHouse summerHouse1 = new SummerHouse(50000,270,4,3,2);
    private SummerHouse summerHouse2 = new SummerHouse(60000,330,4,2,2);
    private SummerHouse summerHouse3 = new SummerHouse(55000,300,6,3,1);

    public List<House> getHouseList(){
        List<House> houseList = new ArrayList<>();
        houseList.add(this.house1);
        houseList.add(this.house2);
        houseList.add(this.house3);
        return houseList;
    }
    public List<Villa> getVillaList(){
        List<Villa> villaList = new ArrayList<>();
        villaList.add(this.villa1);
        villaList.add(this.villa2);
        villaList.add(this.villa3);
        return villaList;
    }
    public List<SummerHouse> getSummerHouseList(){
        List<SummerHouse> summerHouseList = new ArrayList<>();
        summerHouseList.add(this.summerHouse1);
        summerHouseList.add(this.summerHouse2);
        summerHouseList.add(this.summerHouse3);
        return summerHouseList;
    }
}
