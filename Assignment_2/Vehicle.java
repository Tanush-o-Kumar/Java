public class Vehicle {

    public String brandName;
    public String modelName;
    public String color;
    public double price;
    private String mfgCode;
    public int seatingCapacity;
    public double claimedMileage;
    public char fuelType;
    public boolean auto;

    // Default constructor
    public Vehicle() {
        brandName = "Mercedes";
        modelName = "Class C";
        price = 99999.99;
        color = "White";
        mfgCode = "ABCDE1234";
    }

    // Parameterized constructor (brand, model, price)
    public Vehicle(String bName, String mName, double price) {
        brandName = bName;
        modelName = mName;
        this.price = price;
    }

    // Parameterized constructor (brand, seating, color)
    public Vehicle(String bName, int s, String color) {
        brandName = bName;
        seatingCapacity = s;
        this.color = color;
    }

    // Copy constructor
    public Vehicle(Vehicle v) {
        brandName = v.brandName;
        modelName = v.modelName;
        color = v.color;
        price = v.price;
        seatingCapacity = v.seatingCapacity;
        mfgCode = v.mfgCode;
    }

    // Setter
    public void setMfgCode(String mCode) {
        mfgCode = mCode;
    }

    // Getter
    public String getMfgCode() {
        return mfgCode;
    }

    public void start() {
        System.out.println("This vehicle has started.");
    }

    public void drive() {
        System.out.println("This vehicle can be driven on all surfaces.");
    }

    public void stop() {
        System.out.println("Stop the ignition. You're at 0 kmph now!");
    }

    public float changeSpeed(float initSp) {
        float newSp;
        if (initSp < 20) {
            newSp = initSp + 20;
        } else {
            newSp = initSp - 20;
        }
        return newSp;
    }

    public float calcMileage(float dist, float fuel) {
        return dist / fuel;
    }

    // Main method (optional for testing)
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.brandName = "Honda";
        v1.modelName = "Accord";
        v1.color = "Blue";
        v1.setMfgCode("XYZ1234");
        v1.price = 250000.45;

        v1.start();
        v1.drive();

        float newSp = v1.changeSpeed(40);
        System.out.println("New speed: " + newSp);

        float mileage = v1.calcMileage(500, 25);
        System.out.println("Mileage: " + mileage);

        v1.stop();
        printVehicleDetails(v1);
    }

    public static void printVehicleDetails(Vehicle v) {
        System.out.println("=========== Vehicle Details ============");
        System.out.println("Brand Name: " + v.brandName);
        System.out.println("Model Name: " + v.modelName);
        System.out.println("Color: " + v.color);
        System.out.println("Price: " + v.price);
        System.out.println("Mfg Code: " + v.getMfgCode());
    }
}