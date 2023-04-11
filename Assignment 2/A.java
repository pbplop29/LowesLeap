import calculator.Calc;
class A{
    public static void main(String args[]){
        Calc obj = new Calc();
        System.out.println(obj.add(4,5));
        System.out.println(obj.sub(10,5));
        System.out.println(obj.mul(4,4));
        System.out.println(obj.div(10,5));
    }
}