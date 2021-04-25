package com.company2;

import com.company1.BMWServise;
import com.company1.Factory;

public class MercedesFactory extends Factory {

    private MercedesService mercedesService = new MercedesService(this);

    public MercedesService getMercedesService() {
        return mercedesService;
    }

    public MercedesFactory(String[] models, int[] engineVolumes,
                           String[] colors) {
        this.models = models;
        this.engineVolumes = engineVolumes;
        this.colors = colors;
        storehouseCars.add(new MercedesCar("CLS", 1500, "blue"));
        storehouseCars.add(new MercedesCar("Maybach", 3900, "white"));
        storehouseCars.add(new MercedesCar("Vito", 2900, "silver"));
    }
}
