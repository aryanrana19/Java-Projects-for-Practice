class Vehicle{
    private int vehicleId;
    private String brand;
    private String type;
    private String model;
    private int pricePerDay;
    public enum Status {
        AVAILABLE,
        RENTED;
    }
    private Status status;

    public Vehicle(int vehicleId, String brand, String type, String model, int pricePerDay, Status status){ 
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }

    public int getVehicleId(){
        return vehicleId;
    }

    public String getBrand(){
        return brand;
    }

    public String getType(){
        return type;
    }

    public String getModel(){
        return model;
    }

    public int getPricePerDay(){
        return pricePerDay;
    }

    public Status getStatus(){
        return status;
    }

}