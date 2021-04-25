package com.company1;

import java.util.List;

public abstract class Salon {

    protected abstract void orderNewCar(Car newCar);

    public void changeCarColor (int carNumber, String newColor){
        System.out.println("Изменение цвета для автомобиля No. " + carNumber);
    }

    public void changeCarWheels (int carNumber, String newWheelSize){
        System.out.println("Замена колес на машину No. " + carNumber);
    }

}
