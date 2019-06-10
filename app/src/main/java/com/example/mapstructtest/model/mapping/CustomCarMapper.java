package com.example.mapstructtest.model.mapping;

import com.example.mapstructtest.model.CustomCar;
import com.example.mapstructtest.model.CustomCarDto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CustomTypeAdapter.class)
public interface CustomCarMapper {
	CustomCarMapper INSTANCE = Mappers.getMapper(CustomCarMapper.class);

	CustomCarDto toDto(CustomCar car);

	CustomCar toModel(CustomCarDto car);

}