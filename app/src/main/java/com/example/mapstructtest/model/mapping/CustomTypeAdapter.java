package com.example.mapstructtest.model.mapping;

import com.example.mapstructtest.model.CustomCar;
import com.example.mapstructtest.model.CustomCarDto;

public class CustomTypeAdapter {

    public CustomCarDto.Type toDto(CustomCar.OtherNameType source) {
        return new CustomCarDto.Type(source.name);
    }

    public CustomCar.OtherNameType toModel(CustomCarDto.Type source) {
        return new CustomCar.OtherNameType(source.name);
    }

}