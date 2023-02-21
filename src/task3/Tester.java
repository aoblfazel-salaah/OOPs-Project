package task3;

public class Tester {
    public static void main(String[] args) {

        Car [] array={new Sedan(40000, "White", 10),
                new Truck(85000, "Black", 2500)};

        for (Car car:array){
            System.out.println("final price "+car.calculateSalePrice());
        }
    }
}
