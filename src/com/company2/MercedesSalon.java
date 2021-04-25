package com.company2;

import com.company1.Car;
import com.company1.Salon;

import java.util.List;

public class MercedesSalon extends Salon {

    private final MercedesFactory mercedesFactory;
    private final List<Car> storeMercedesList;

    public List<Car> getStoreMercedesList() {
        return storeMercedesList;
    }

    public MercedesSalon(MercedesFactory mercedesFactory) {
        this.mercedesFactory = mercedesFactory;
        this.storeMercedesList = mercedesFactory.getStorehouseCars();
    }

    public void orderNewCar(Car newCar) {
        mercedesFactory.createCar(newCar);
    }

    public void changeCarColor (int carNumber, String newColor){
        System.out.println("Изменение цвета для автомобиля No. " + carNumber);
        mercedesFactory.getMercedesService().changeColor(storeMercedesList.get(carNumber-1), newColor);
    }

    public void changeCarWheels (int carNumber, String newWheelSize){
        System.out.println("Замена колес на машину No. " + carNumber);
        mercedesFactory.getMercedesService().changeWheelSize(storeMercedesList.get(carNumber-1), newWheelSize);
    }

}
