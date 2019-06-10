package com.example.mapstructtest.model;

public class CustomCarDto {
    public Type type;

    @Override
    public String toString() {
        return "CustomCarDto{" +
                "type.name=" + type.name +
                '}';
    }

    public static class Type {
        public Type(String name) {
            this.name = name;
        }

        final public String name;
    }
}