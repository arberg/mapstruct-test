package com.example.mapstructtest.model;

public class CustomCar {
	public OtherNameType type;

	@Override
	public String toString() {
		return "CustomCar{" +
				"type.name=" + type.name +
				'}';
	}

	public static class OtherNameType {
		public final String name;

		public OtherNameType(String name) {
			this.name = name;
		}
	}
}