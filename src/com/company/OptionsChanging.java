package com.company;

import com.company1.Car;

public interface OptionsChanging {

    void changeColor(Car car, String newColor);
    void changeWheelSize(Car car, String newWheelSize);
    void addOption(Car car, String optionToAdd);
    void removeOption(Car car, String optionToRemove);

}
