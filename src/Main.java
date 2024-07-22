import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Easy Ride Company");

        Route route1 = new Route("Barera Hotel, Gernata dist", "King Saud University",20.65 );
        Route route2 = new Route("Kingdom tower", "Salbokh",45.20);

        Car car1 = new Car("B12", route1, 2);
        Car car2 = new Car("C76", route2, 0);

        ArrayList<Passenger> list = new ArrayList<>();
        SubscriberPassenger p1 = new SubscriberPassenger("Omar Alshehri", "Q456");
        SubscriberPassenger p2 = new SubscriberPassenger("Abdullah Qasas", "Q257");
        NonSubscribers p3 = new NonSubscribers("Saeed bin Khalid", "Q852", true);
        NonSubscribers p4 = new NonSubscribers("Ali bin Zidan", "Q798", false);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        try {
            p1.reserveCar(car1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p2.reserveCar(car1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p3.reserveCar(car1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            p4.reserveCar(car2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for (Passenger passenger : list) {
            passenger.displayInfo();
            System.out.println();
        }

    }
}