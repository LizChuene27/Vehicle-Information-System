/**
 * The Car class represents a specific type of vehicle - a car.
 * It implements the CarVehicle interface, providing methods for accessing
 * and modifying details specific to cars, such as the number of doors and fuel type.
 */
class Car implements CarVehicle {
    private String make;
    private String model;
    private int year;
    private int numDoors;
    private String fuelType;

    /**
     * Constructs a new Car object with the specified make, model, and year.
     *
     * @param make  The make of the car.
     * @param model The model of the car.
     * @param year  The year of manufacture of the car.
     */
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Implement methods from the CarVehicle interface

    /**
     * Sets the number of doors for the car.
     *
     * @param numDoors The number of doors to set.
     * @throws IllegalArgumentException If the number of doors is not greater than 0.
     */
    @Override
    public void setNumDoors(int numDoors) {
        if (numDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be greater than 0.");
        } else {
            this.numDoors = numDoors;
        }
    }

    /**
     * Retrieves the number of doors for the car.
     *
     * @return The number of doors for the car.
     */
    @Override
    public int getNumDoors() {
        return numDoors;
    }

    /**
     * Sets the fuel type for the car.
     *
     * @param fuelType The fuel type to set.
     * @throws IllegalArgumentException If the fuel type is null or empty.
     */
    @Override
    public void setFuelType(String fuelType) {
        if (fuelType == null || fuelType.trim().isEmpty()) {
            throw new IllegalArgumentException("Fuel type cannot be null or empty.");
        } else {
            this.fuelType = fuelType;
        }
    }

    /**
     * Retrieves the fuel type for the car.
     *
     * @return The fuel type for the car.
     */
    @Override
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Retrieves the make of the car.
     *
     * @return The make of the car.
     */
    @Override
    public String getMake() {
        return make;
    }

    /**
     * Retrieves the model of the car.
     *
     * @return The model of the car.
     */
    @Override
    public String getModel() {
        return model;
    }

    /**
     * Retrieves the year of manufacture of the car.
     *
     * @return The year of manufacture of the car.
     */
    @Override
    public int getYear() {
        return year;
    }
}

/**
 * The Motorcycle class represents a specific type of vehicle - a motorcycle.
 * It implements the MotorVehicle interface, providing methods for accessing
 * and modifying details specific to motorcycles, such as the number of wheels and motorcycle type.
 */
class Motorcycle implements MotorVehicle {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private String motorcycleType;

    /**
     * Constructs a new Motorcycle object with the specified make, model, and year.
     *
     * @param make  The make of the motorcycle.
     * @param model The model of the motorcycle.
     * @param year  The year of manufacture of the motorcycle.
     */
    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Implement methods from the MotorVehicle interface

    /**
     * Sets the number of wheels for the motorcycle.
     *
     * @param numWheels The number of wheels to set.
     * @throws IllegalArgumentException If the number of wheels is not greater than 0.
     */
    @Override
    public void setNumWheels(int numWheels) {
        if (numWheels <= 0) {
            throw new IllegalArgumentException("Number of wheels must be greater than 0.");
        } else {
            this.numWheels = numWheels;
        }
    }

    /**
     * Retrieves the number of wheels for the motorcycle.
     *
     * @return The number of wheels for the motorcycle.
     */
    @Override
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * Sets the type of the motorcycle (e.g., sport, cruiser, off-road).
     *
     * @param motorcycleType The type of the motorcycle to set.
     * @throws IllegalArgumentException If the motorcycle type is null or empty.
     */
    @Override
    public void setMotorcycleType(String motorcycleType) {
        if (motorcycleType == null || motorcycleType.trim().isEmpty()) {
            throw new IllegalArgumentException("Motorcycle type cannot be null or empty.");
        } else {
            this.motorcycleType = motorcycleType;
        }
    }

    /**
     * Retrieves the type of the motorcycle.
     *
     * @return The type of the motorcycle.
     */
    @Override
    public String getMotorcycleType() {
        return motorcycleType;
    }

    /**
     * Retrieves the make of the motorcycle.
     *
     * @return The make of the motorcycle.
     */
    @Override
    public String getMake() {
        return make;
    }

    /**
     * Retrieves the model of the motorcycle.
     *
     * @return The model of the motorcycle.
     */
    @Override
    public String getModel() {
        return model;
    }

    /**
     * Retrieves the year of manufacture of the motorcycle.
     *
     * @return The year of manufacture of the motorcycle.
     */
    @Override
    public int getYear() {
        return year;
    }
}

/**
 * The Truck class represents a specific type of vehicle - a truck.
 * It implements the TruckVehicle interface, providing methods for accessing
 * and modifying details specific to trucks, such as cargo capacity and transmission type.
 */
class Truck implements TruckVehicle {
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    /**
     * Constructs a new Truck object with the specified make, model, and year.
     *
     * @param make  The make of the truck.
     * @param model The model of the truck.
     * @param year  The year of manufacture of the truck.
     */
    public Truck(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Implement methods from the TruckVehicle interface

    /**
     * Sets the cargo capacity for the truck.
     *
     * @param cargoCapacity The cargo capacity to set.
     * @throws IllegalArgumentException If the cargo capacity is not greater than 0.
     */
    @Override
    public void setCargoCapacity(double cargoCapacity) {
        if (cargoCapacity <= 0) {
            throw new IllegalArgumentException("Cargo capacity must be greater than 0.");
        } else {
            this.cargoCapacity = cargoCapacity;
        }
    }

    /**
     * Retrieves the cargo capacity for the truck.
     *
     * @return The cargo capacity for the truck.
     */
    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * Sets the transmission type for the truck (e.g., manual or automatic).
     *
     * @param transmissionType The transmission type to set.
     * @throws IllegalArgumentException If the transmission type is null or empty.
     */
    @Override
    public void setTransmissionType(String transmissionType) {
        if (transmissionType == null || transmissionType.trim().isEmpty()) {
            throw new IllegalArgumentException("Transmission type cannot be null or empty.");
        } else {
            this.transmissionType = transmissionType;
        }
    }

    /**
     * Retrieves the transmission type for the truck.
     *
     * @return The transmission type for the truck.
     */
    @Override
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * Retrieves the make of the truck.
     *
     * @return The make of the truck.
     */
    @Override
    public String getMake() {
        return make;
    }

    /**
     * Retrieves the model of the truck.
     *
     * @return The model of the truck.
     */
    @Override
    public String getModel() {
        return model;
    }

    /**
     * Retrieves the year of manufacture of the truck.
     *
     * @return The year of manufacture of the truck.
     */
    @Override
    public int getYear() {
        return year;
    }
}
