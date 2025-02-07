public class ParkingLot {
    ParkingSpot[] spot;
    public ParkingLot(){
        this.spot = new ParkingSpot[8];
        this.spot[0] = new ParkingSpot(null, true);
        this.spot[1] = new ParkingSpot(null, true);
        this.spot[2] = new ParkingSpot(null, false);
        this.spot[3] = new ParkingSpot(null, false);
        this.spot[4] = new ParkingSpot(null, false);
        this.spot[5] = new ParkingSpot(null, false);
        this.spot[6] = new ParkingSpot(null, false);
        this.spot[7] = new ParkingSpot(null, false);

    }  

    public int ParkCar(Car CurrentCar, ParkingLot lot){
        for(int i = 0; i < lot.spot.length; i++){
            if (lot.spot[i].parkedcar == null){
                if(lot.spot[i].handicapAccessible){
                    if(CurrentCar.hcap){ 
                        lot.spot[i].parkedcar = CurrentCar;
                        return i;
                    }
                }
                else{
                    lot.spot[i].parkedcar = CurrentCar;
                    return i;
                }

            }
        }
    return -1;
    }
    public Car Check(ParkingLot lot, int spot){
        Car TempCar = lot.spot[spot].parkedcar; 
        lot.spot[spot].parkedcar = null;
        return TempCar;
    }


    public String toString(ParkingLot lot){
        int AccessibleCounter = 0;
        int RegularSpotsCounter = 0;
        for (int i = 0; i < lot.spot.length; i++){
            if (lot.spot[i].parkedcar == null){
                if(lot.spot[i].handicapAccessible){
                    AccessibleCounter++;
            }
            else{
                RegularSpotsCounter++;
            
            }
            
        }
    }
        return AccessibleCounter + " " + RegularSpotsCounter;
}
}
