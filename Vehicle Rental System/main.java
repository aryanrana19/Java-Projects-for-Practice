import java.util.*;

class Vehicle{
    private int id;
    private String brand;
    private String type;
    private String model;
    private int pricePerDay;
    public enum Status {
        AVAILABLE,
        RENTED;
    }
    private Status status;

    public Vehicle(int id, String brand, String type, String model, int pricePerDay, Status status){ 
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }

    public int getId(){
        return id;
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

    public boolean rentVehicle(){
        if(status == Status.AVAILABLE){
            status = Status.RENTED;
            return true;
        }else{
            return false;
        }
    }

    public boolean returnVehicle(){
        if(status == Status.RENTED){
            status = Status.AVAILABLE;
            return true;
        }else{
            return false;
        }
    }

}

class Customer{
    private String name;
    private int id;
    private String phoneNumber;
    private String email;
    private String licenseNumber;

    public Customer(int id, String name, String phoneNumber, String email, String licenseNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public boolean hasValidLicense(){
        return licenseNumber != null && !licenseNumber.isEmpty();
    }
}

class RentalAgreement{
    private Vehicle vehicle;
    private Customer customer;
    private int numberOfDays;
    private enum AgreementStatus {ACTIVE, COMPLETED;}
    public AgreementStatus status;

    public RentalAgreement(Vehicle vehicle, Customer customer, int numberOfDays){
        this.vehicle = vehicle;
        this.customer = customer;
        this.numberOfDays = numberOfDays;
        this.status = AgreementStatus.ACTIVE;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public Customer getCustomer(){
        return customer;
    }

    public int getNumberOfDays(){
        return numberOfDays;
    }

    public AgreementStatus getStatus(){
        return status;
    }

}

class RentalService{
    private List<Vehicle> vehicles;
    private List<Customer> customers;
    private List<RentalAgreement> agreements;

    public RentalService(){
        vehicles = new ArrayList<>();
        customers = new ArrayList<>();
        agreements = new ArrayList<>();
    }

    public boolean addVehicle(Vehicle vehicle){
        for(Vehicle existing : vehicles){
            if(existing.getId() == vehicle.getId()){
                return false;
            }
        }
        vehicles.add(vehicle);
        return true;
    }

    public boolean addCustomer(Customer customer){
        for(Customer existing : customers){
            if(existing.getId() == customer.getId()){
                return false;
            }
        }
        customers.add(customer);
        return true;
    }

    private Vehicle findVehicleById(int id){
        for(Vehicle v : vehicles){
            if(v.getId() == id){
                return v;
            }
        }
        return null;
    }

    private Customer findCustomerById(int id){
        for(Customer c : customers){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public boolean rentVehicle(int vehicleId, int customerId, int numberOfDays){
        Vehicle vehicle = findVehicleById(vehicleId);
        Customer customer = findCustomerById(customerId);
        if(vehicle==null || customer ==null){
            return false;
        }
        if(numberOfDays <= 0){
            return false;
        }
        if(!customer.hasValidLicense()){
            return false;
        }
        if(!vehicle.rentVehicle()){
            return false;
        }

        RentalAgreement agreement = new RentalAgreement(vehicle, customer, numberOfDays);

        agreements.add(agreement);

        return true;
    }

}