package transport;

import java.io.Serializable;
import java.util.Calendar;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;

    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String number;
    private final int numberOfSeats;
    private boolean summerTires;

    private Key key;

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key (false, false);
        }
        this.key = key;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String number, int numberOfSeats, boolean summerTires, Key key) {
        this.brand = (brand == null || brand.length() == 0 ? "Default" : brand);
        this.model = (model == null || brand.length() == 0 ? "Default" : model);
        this.engineVolume = (engineVolume == 0 ? 1.7 : engineVolume);
        setEngineVolume(engineVolume);
        this.color = (color == null || brand.length() == 0 ? "Default" : color);
        this.year = (year == 0 ? 2000 : year);
        this.country = (country == null || brand.length() == 0 ? "Default" : country);
        this.transmission = (transmission == null || brand.length() == 0 ? "Default" : transmission);
        this.bodyType = (bodyType == null || brand.length() == 0 ? "Default" : bodyType);
        this.number = (number == null || brand.length() == 0 ? "Default" : number);
        this.numberOfSeats = (numberOfSeats < 4 ? 4 : numberOfSeats);
        this.summerTires = summerTires;
        setKey(key);
    }

    Calendar calendar = Calendar.getInstance();
    public void changeTire() {
        int month = calendar.get(Calendar.MONTH);
        if (month == 1 || month == 2 || month == 3 || month == 12 || month == 11) {
        setTires(false);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTires() {
        return summerTires;
    }

    public void setTires(boolean tires) {
        this.summerTires = summerTires;
    }
    @Override
    public String toString() {
        return "\nCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", number='" + number + '\'' +
                ", numberOfSeats=" + numberOfSeats + '\'' +
                ", " + (summerTires ? "Летняя резина" : "Зимняя резина") + '\'' +
                '}';
    }

    public static class Key {
        private final boolean remoteLaunch;
        private final boolean keylessEntry;

        public boolean isRemoteLaunch() {
            return remoteLaunch;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteLaunch=" + remoteLaunch +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }

        public Key(boolean remoteLaunch, boolean keylessEntry) {
            this.remoteLaunch = remoteLaunch;
            this.keylessEntry = keylessEntry;
        }
    }

}

