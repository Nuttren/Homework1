package transport;

public class Transport {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    private String brand;
        private String model;
        private double maxSpeed;

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    private String color;
        private final int year = 2020;
        private final String country = "Россия";

        public Transport(String brand, String model, double maxSpeed, String color) {
            this.brand = (brand == null || brand.length() == 0 ? "Default" : brand);
            this.model = (model == null || brand.length() == 0 ? "Default" : model);
            this.maxSpeed = (maxSpeed <= 0 ? 150 : maxSpeed);
            this.color = (color == null || brand.length() == 0 ? "Default" : color);
        }
    }


