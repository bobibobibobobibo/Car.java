public class CarTest {
    public static void main(String[] args){
        Car car1 = new Car("Honda","Yage",1973);
        Car car2 = new Car("Bydauto","SUV",1995);
        Car car3 = new Car("wuling","hongguang",1990);

       // car1.setMake("hongqi");
        System.out.println(car1);
        System.out.println(car1.getYear());

        //car2.setModel("L5");
        System.out.println(car2);
        System.out.println(car2.getMake());

        //car3.setYear(1985);
        System.out.println(car3);
        System.out.println(car3.getModel());

    }
}
