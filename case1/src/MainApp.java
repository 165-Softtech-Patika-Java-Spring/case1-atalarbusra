public class MainApp {

    public static void main(String[] args) {
        StructerService structerService = new StructerService();

        System.out.println("Total prices of houses: " + structerService.getTotalPriceofHouse());
        System.out.println("Total prices of villas: " + structerService.getTotalPriceofVilla());
        System.out.println("Total prices of summer houses: " + structerService.getTotalPriceofSummerHouse());
        System.out.println("Total price: " + structerService.totalPrice());
        System.out.println("Average area of houses: " + structerService.averageAreaofHouse());
        System.out.println("Average area of villas: " + structerService.averageAreaVilla());
        System.out.println("Average area of summer houses: " + structerService.averageAreaSummerHouse());
        System.out.println("Average area: " + structerService.averageArea());  
        System.out.println(structerService.getStructers(4,3));
    }
}
