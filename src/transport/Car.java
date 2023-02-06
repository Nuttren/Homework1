package transport;

import java.util.Calendar;

public class Car extends Transport{

    private double engineVolume;

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

    public Car(String brand, String model, double engineVolume, double maxSpeed, String color, int year, String country, String transmission, String bodyType, int numberOfSeats, boolean summerTires, Key key) {
        super(brand, model, maxSpeed, color);
        this.engineVolume = (engineVolume <= 0 ? 1.7 : engineVolume);
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


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
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
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", maxSpeed=" + getMaxSpeed() +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", number='" + number + '\'' +
                ", numberOfSeats=" + numberOfSeats + '\'' +
                ", " + (summerTires ? "Летняя резина" : "Зимняя резина") + '\'' +
                ", " + key + '\'' +
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

