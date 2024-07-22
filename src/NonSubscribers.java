public class NonSubscribers extends Passenger{

    private boolean discountCoupon;
    public NonSubscribers(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if(car.getMaxCapacity() == 0){
            throw new Exception(ANSI_RED +"Sorry " + name + " Car is full, try another car."+ ANSI_RESET);

        }
        car.addPassengers();
        this.reserved = car;
        if(discountCoupon){
            this.tripCost = reserved.getRoute().getTripPrice()*0.9;
        }else{
            this.tripCost = reserved.getRoute().getTripPrice();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Subscriber passenger: "+ name + ", ID: "+ id);
        if(reserved != null){
            System.out.println("Reserved car: "+ reserved.getCode()+ ",  Car capacity: "+ reserved.getMaxCapacity());
            System.out.println("Pickup address: "+ reserved.getRoute().getPickUpAddress());
            System.out.println("Destination: "+ reserved.getRoute().getDestination());
            System.out.println("Trip cost: "+ tripCost);
        }
    }
}
