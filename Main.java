// Main program
public class MainProgram {
    public static void main(String[] args) {
        // Create objects of different vehicle types
        try {
            Car car = new Car("Kia", "Rio", 2023);
            car.setNumDoors(4);
            car.setFuelType("Petrol");

            Motorcycle motorcycle = new Motorcycle("Harley", "Sportster", 2020);
            motorcycle.setNumWheels(2);
            motorcycle.setMotorcycleType("Cruiser");

            Truck truck = new Truck("Kia", "Sonet", 2023);
            truck.setCargoCapacity(2.5);
            truck.setTransmissionType("Automatic");

            // Display details of each vehicle
            displayVehicleDetails(car);
            displayVehicleDetails(motorcycle);
            displayVehicleDetails(truck);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Display details of a vehicle
    private static void displayVehicleDetails(Vehicle vehicle) {
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());

        // Additional details based on the interface implemented
        if (vehicle instanceof CarVehicle) {
            CarVehicle car = (CarVehicle) vehicle;
            System.out.println("Number of Doors: " + car.getNumDoors());
            System.out.println("Fuel Type: " + car.getFuelType());
        } else if (vehicle instanceof MotorVehicle) {
            MotorVehicle motorcycle = (MotorVehicle) vehicle;
            System.out.println("Number of Wheels: " + motorcycle.getNumWheels());
            System.out.println("Motorcycle Type: " + motorcycle.getMotorcycleType());
        } else if (vehicle instanceof TruckVehicle) {
            TruckVehicle truck = (TruckVehicle) vehicle;
            System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
            System.out.println("Transmission Type: " + truck.getTransmissionType());
        }

        System.out.println(); // Add a line break for better readability
    }
}
