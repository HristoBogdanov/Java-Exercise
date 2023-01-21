public abstract class Vehicle {
    private int horsePower;
    private String brand;
    private String model;
    private boolean isPrivate;
    private int numberOfSeats;
    private String location;

    public int getHorsePower() {
        return horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getLocation() {
        return location;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Vehicle(String brand, int numberOfSeats, int horsePower)
    {
        this.brand=brand;
        this.numberOfSeats=numberOfSeats;
        this.horsePower=horsePower;
    }

    public abstract void travelRequirments();

    @Override
    public String toString() {
        return " Vehicle " +
                " horsePower= " + horsePower +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isPrivate= " + isPrivate +
                ", numberOfSeats= " + numberOfSeats +
                ", location=' " + location + '\'';
    }
}
