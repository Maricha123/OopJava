package org.oopfundamentals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarModel extends CarBrand {
    private String modelName;
    private int year;

    public CarModel(String brandName, String country, String modelName, int year) {
        super(brandName, country);
        this.modelName = modelName;
        this.year = year;
    }
}