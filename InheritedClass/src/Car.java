import java.util.ArrayList;

public class Car extends Vehicle{
private double engineVolume;
private ArrayList<String> locations;
    public Car(String brand, int numberOfSeats, int horsePower,double engineVolume) {
        super(brand, numberOfSeats, horsePower);
        this.engineVolume=engineVolume;
        locations=new ArrayList<>();
    }

    @Override
    public void travelRequirments() {
        System.out.println("5 liters of diesel per 100km.");
    }

    @Override
    public String toString() {

        String pathList="";

        //Така се пише foreach цикъл в Java !
        for(String el: locations){
            pathList+=el;
            pathList+=", ";
        }

        return pathList + "Car " +
                " engineVolume= " + engineVolume +
                super.toString();
    }
    public String goToLocation(String destination) {
        String result="We went from "+ getLocation() + " to " + destination;
        setLocation(destination);
        locations.add(destination);
        return result;
    }
    public String removeLocation(String location){
        String result="";
        if(locations.contains(location)){
            locations.remove(location);
            result="Successfully removed "+ location;
        }
        else result="No such location exists";
        return result;

    }
}
