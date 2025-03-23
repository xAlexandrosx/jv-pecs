package core.mate.academy.model;

import java.util.Objects;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int cargoCapacity;
    private int fuelEfficiency;
    private int numberOfWheels;

    public Truck() {
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{"
                + "cargoCapacity=" + cargoCapacity
                + ", fuelEfficiency=" + fuelEfficiency
                + ", numberOfWheels=" + numberOfWheels
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Truck truck = (Truck) o;
        return cargoCapacity == truck.cargoCapacity
                && fuelEfficiency == truck.fuelEfficiency
                && numberOfWheels == truck.numberOfWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargoCapacity, fuelEfficiency, numberOfWheels);
    }
}
