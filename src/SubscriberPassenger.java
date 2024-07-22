public class SubscriberPassenger extends Passenger{

    public SubscriberPassenger(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if(car.getMaxCapacity()==0){
            throw new Exception(ANSI_RED +"Sorry " + name + " Car is full, try another car."+ ANSI_RESET);
        }
        car.addPassengers();
        this.reserved = car;
        tripCost = car.getRoute().getTripPrice()*0.5;
    }

    @Override
    public void displayInfo() {
        System.out.println("Subscriber passenger: "+ name + ", ID: "+ id);
        if(reserved != null){
            System.out.println("Reserved car: "+ reserved.getCode()+ ",  Car capacity: "+ reserved.getMaxCapacity());
            System.out.println("Pickup address: "+ reserved.getRoute().getPickUpAddress());
            System.out.println("Destination: "+ reserved.getRoute().getDestination());
            System.out.println("Trip cost: "+ tripCost);
        }
    }
}
