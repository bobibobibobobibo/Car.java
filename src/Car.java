public class Car {
    private int year;
    private String make , model;
    public Car(String make,String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String setMake(){
        return make;
    }

    public String setModel(){
        return model;
    }

    public int setYear(){
        return year;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public  int getYear(){
        return year;
    }

    public class isAntique {
        public String toString(){
            return"make :"+ make + "model"+model+"year"+ year;
        }
    }


}
