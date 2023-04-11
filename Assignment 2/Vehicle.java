class Vehicle extends Automobile{
    String title = "Petrol Engine";
    String model = "Ford";
    void engine_1(){
        System.out.println(title);
        System.out.println(super.title);
    }
}