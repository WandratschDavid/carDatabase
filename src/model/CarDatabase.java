package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CarDatabase
{
    protected HashMap<String, Vehicle> db = new HashMap<>();

    public CarDatabase()
    {
        for (int carCount = 0; carCount < 1000; carCount++)
        {
            Vehicle vehicle = new Vehicle();
            db.put(vehicle.getLicensePlate(), vehicle);
            System.out.println("Created vehicle: " + vehicle.getLicensePlate() + "!");
        }
    }

    public List<Vehicle> search(String licensePlate, boolean exact)
    {
        double startTime = System.nanoTime();
        List<Vehicle> foundedVehicles = new LinkedList<>();

        if (exact)
        {
            foundedVehicles.add(db.get(licensePlate));
        }
        else
        {
            for (String searched : db.keySet())
            {
                if (db.get(searched).getLicensePlate().contains(licensePlate))
                {
                    foundedVehicles.add(db.get(searched));
                }
            }
        }

        double endTime = System.nanoTime();
        double searchTime = endTime - startTime;
        System.out.println("Results found in: " + searchTime + " ns");

        return foundedVehicles;
    }
}