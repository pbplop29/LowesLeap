class Car extends Vehicle{
    String title = "CB20Tx25";
    String model = "Nano";
    void engine(){
        System.out.println(super.title);
        System.out.println(title);
        System.out.println(super.model);
        System.out.println(model);
    }

}