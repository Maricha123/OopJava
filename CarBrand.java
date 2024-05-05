package org.oopfundamentals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarBrand {
    private String name;
    private String country;

    public CarBrand(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
