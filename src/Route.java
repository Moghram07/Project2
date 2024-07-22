public class Route {
    private String pickUpAddress;
    private String destination;
    private double tripPrice;

    public Route(String pickUpAddress, String destination, double tripPrice){
        this.pickUpAddress = pickUpAddress;
        this.destination = destination;
        this.tripPrice = tripPrice;
    }

    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}
