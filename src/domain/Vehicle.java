package domain;

public abstract class Vehicle {
    private final String make;
    private final String model;
    private final long speed;

    protected Vehicle(String make, String model, long speed) {
        this.make = make;
        this.model = model;
        if (speed < 0) {
            throw new IllegalArgumentException("Speed must be non-negative");
        }
        this.speed = speed;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public long getSpeed() {
        return speed;
    }

    public long move(double duration) {
        if (duration  < 0) {
            throw new IllegalArgumentException("Duration must be non-negative");
        }
        double distance = speed * duration;
        return Math.round(distance);
    }

    public String toString() {
        return make + " " + model + ", speed =" + speed + " km/h";
    }
}