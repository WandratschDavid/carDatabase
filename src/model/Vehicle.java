package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Vehicle
{
    private String color;
    private String owner;
    private String manufacturer;
    private String model;
    private String licensePlate;

    public Vehicle() {}


    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }


    @Override
    public String toString()
    {
        return "License-Plate: " + this.getLicensePlate() +
                "\nOwner: " + this.getOwner() +
                "\nManufacturer: " + this.getManufacturer() +
                "\nModel: " + this.getModel() +
                "\nColor: " + this.getColor() + "\n\n";
    }
}