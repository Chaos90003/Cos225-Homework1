public class ParkingTester {
    public static void main(String[] args){
        ParkingLot lot = new ParkingLot();
        System.out.printf("%s\n", lot.toString(lot));
        Car infiniti = new Car("Infiniti", "Blue", true);
        lot.ParkCar(infiniti, lot);
        System.out.printf("%s\n", lot.toString(lot));
        Car Cadiliac = new Car("Cadiliac", "Black", false);
        lot.ParkCar(Cadiliac, lot);
        System.out.printf("%s\n", lot.toString(lot));
        lot.Check(lot, 0);
        System.out.printf("%s\n", lot.toString(lot));
    }
}
