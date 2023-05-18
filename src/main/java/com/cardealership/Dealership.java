package com.cardealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    public ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        //List<Vehicle>
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        //List<Vehicle>
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        //List<Vehicle>
        return null;
    }

    public List<Vehicle> getVehiclesByColor (String color) {
        //List<Vehicle>
        return null;
    }

    public List<Vehicle> getVehiclesByMileage (int min, int max) {
        //List<Vehicle>
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        //List<Vehicle>
        return null;
    }

    public List<Vehicle> getAllVehicles() {
        //List<Vehicle>
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
