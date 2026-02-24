public class MainForVehicle {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle(); //Constructor of a class
        v1.brandName = "Honda";
        v1.modelName = "Accord";
        v1.color = "Blue";
        v1.setMfgCode("XYZ1234");
        v1.price = 250000.45;
        //v1.start();
        //v1.drive();
        float newSp = v1.changeSpeed(40);
        System.out.println("New speed: " +newSp);
        float mileage = v1.calcMileage(500, 25);
        System.out.println("Mileage: "+mileage);
        //v1.stop();
        //printVehicleDetails(v1);
        Vehicle v2 = new Vehicle();
        v2.brandName = "Toyota";
        v2.modelName = "Fortuner";
        v2.color = "Pink";
        v2.setMfgCode("hdsk2443");
        v2.price = 400000.05;
        //v2.start();
        //v2.drive();
        float newSp2 = v2.changeSpeed(40);
        System.out.println("New speed: " +newSp2);
        float mileage2 = v2.calcMileage(600, 29);
        System.out.println("Mileage: "+mileage2);
        //v2.stop();
        //printVehicleDetails(v2);
        Vehicle v3 = new Vehicle();
        //printVehicleDetails(v3);
        //Creating an array of object Vehicle
        Vehicle[] myFleet = new Vehicle[]{v1, v2,v3};
        for (Vehicle v : myFleet){
            printVehicleDetails(v);
            v.start();
            v.drive();
            v.stop();
        }
    }

    public static void printVehicleDetails(Vehicle v){
        System.out.println("===========Vehicle Details ============");
        System.out.println("Brand Name: "+ v.brandName );
        System.out.println("Model Name: "+ v.modelName );
        System.out.println("Color: "+ v.color );
        System.out.println("Price: "+ v.price );
        System.out.println("Mfg Code: "+ v.getMfgCode() );
    }
}