import java.util.ArrayList;
import java.util.List;

public class StructerService {

    public int getTotalPriceofHouse() {
        Structers st = new Structers();
        int totalPrice = 0;

        for (House house : st.getHouseList()) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public int getTotalPriceofVilla() {
        Structers st = new Structers();
        int totalPrice = 0;

        for (Villa villa : st.getVillaList()) {
            totalPrice += villa.getPrice();
        }
        return totalPrice;
    }

    public int getTotalPriceofSummerHouse() {
        Structers st = new Structers();
        int totalPrice = 0;

        for (SummerHouse summerHouse : st.getSummerHouseList()) {
            totalPrice += summerHouse.getPrice();
        }
        return totalPrice;
    }

    public int totalPrice() {
        return getTotalPriceofVilla() + getTotalPriceofHouse() + getTotalPriceofSummerHouse();
    }

    public int averageAreaofHouse() {
        Structers st = new Structers();
        int totalArea = 0;

        for (House house : st.getHouseList()) {
            totalArea += house.getArea();
        }
        return totalArea / st.getHouseList().size();
    }

    public int averageAreaVilla() {
        Structers st = new Structers();
        int totalArea = 0;

        for (Villa villa : st.getVillaList()) {
            totalArea += villa.getArea();
        }
        return totalArea / st.getVillaList().size();
    }

    public int averageAreaSummerHouse() {
        Structers st = new Structers();
        int totalArea = 0;

        for (SummerHouse summerHouse : st.getSummerHouseList()) {
            totalArea += summerHouse.getArea();
        }
        return totalArea / st.getSummerHouseList().size();
    }


    public int averageArea() {
        return (averageAreaofHouse() + averageAreaSummerHouse() + averageAreaVilla()) / 3;
    }

    public List<Object> getStructers(int roomCount,int hallCount){
        Structers st = new Structers();
        List <Object> list = new ArrayList<>();
        for (House house : st.getHouseList()) {
            if(house.getHallCount() == hallCount && house.getRoomCount() == roomCount)
                list.add(house);
        }
        for (Villa villa : st.getVillaList()) {
            if(villa.getHallCount() == hallCount && villa.getRoomCount() == roomCount)
                list.add(villa);
        }
        for (SummerHouse summerHouse : st.getSummerHouseList()) {
            if(summerHouse.getHallCount() == hallCount && summerHouse.getRoomCount() == roomCount)
                list.add(summerHouse);
        }
        return list;
    }

}
