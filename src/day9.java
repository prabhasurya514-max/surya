public class day9 {
    static class Vehicle implements AutoCloseable {
        Vehicle(){
            System.out.println("Vehicle");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Vehicle Close");
        }
    }

    static class Bike extends Vehicle {
        Bike(){
            System.out.println("Bike");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Bike Close");
            super.close();
        }
    }

    static class ElectricBike extends Bike {
        ElectricBike(){
            System.out.println("ElectricBike");
        }

        @Override
        public void close() throws Exception {
            System.out.println("ElectricBike Close");
            super.close();
        }
    }

    static void main() throws Exception {
        try(ElectricBike electricBike = new ElectricBike()){

        }
    }
}











