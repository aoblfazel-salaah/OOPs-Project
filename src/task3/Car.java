package task3;

public class Car {
    /*
    Create a Class Car that would have the following fields:
    carPrice and color and method calculateSalePrice() which should be returning
    a price of the car.
    Create 2 subclasses: Sedan and Truck.
    The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
    in which returned price is calculated as following: if weight>2000
    then returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does its own implementation
    of calculateSalePrice(): if length of sedan is >20 feet then returned car price
    should include 5% discount, otherwise 10% discount
     */
    double carPrice;
    String carColor;

    public Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }
    public double calculateSalePrice(){
        return carPrice;
    }

}
class Truck extends Car{
    double weight;
    public Truck(double carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight=weight;
    }



    @Override
    public double calculateSalePrice() {
        if (weight>2000){
            return carPrice*0.9;
        }
        else{
            return carPrice*0.8;
        }
    }
}
class Sedan extends Car{
    double carLength;

    public Sedan(double carPrice, String carColor, double carLength) {
        super(carPrice, carColor);
        this.carLength = carLength;
    }

    @Override
    public double calculateSalePrice() {
        if(carLength>20){
            return carPrice*0.95;
        }else {
            return carPrice*0.9;
        }
    }

}