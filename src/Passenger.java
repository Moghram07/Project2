public abstract class Passenger{
    protected String ANSI_RED = "\u001B[31m";
    protected String ANSI_RESET = "\u001B[0m";
    protected String name;
    protected String id;
    protected Car reserved;
    protected double tripCost;

    public Passenger(String name, String id){
        this.name = name;
        this.id = id;
    }

    public abstract void reserveCar(Car car)throws Exception;

    public abstract void displayInfo();
}
