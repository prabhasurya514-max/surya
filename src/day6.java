/*public class day6 {
    static class car {
        String color;
        String brand;
        int Speed;
        int fuel;

        car() {
            System.out.println("constructor called");
        }

        car(String color, String brand, int Speed) {
            this.color = color;
            this.Speed = Speed;
            this.brand = brand;
        }

        void daycare(int Speed) {
            fuel += Speed;
            this.Speed = Speed;
        }

        void Expense(int Expense) {
            fuel-=Expense;
        }

        void Showfuel() {
            System.out.println("your fuel is:" + fuel);
        }

        void Printdetails() {
            System.out.println("color:" + color);
            System.out.println("speed:" + Speed);
            System.out.println("fuel:" + fuel);
        }


    }
    public static void main(String[] args) {
        car car = new car("black", "BMW", 5000);
        car.daycare(9000);
        car.Printdetails();
        car.Showfuel();
        car.Expense(879);
        car.Showfuel();
    }
}*/
class Day5marks {

    static class Student {
        String name, dept;
        int regNo;
        int maths, physics, chemistry;

        Student(String n, int r, String d) {
            name = n;
            regNo = r;
            dept = d;
        }
        int getMaths() {
            return maths;
        }
        int getPhysics() {
            return physics;
        }

        int getChemistry() {
            return chemistry;
        }

        void setMaths(int m) {
            maths = m;
        }

        void setPhysics(int p) {
            physics = p;
        }

        void setChemistry(int c) {
            chemistry = c;
        }
        void updateMarks(int m) {
            maths = m;
        }

        void updateMarks(int m, int p) {
            maths = m;
            physics = p;
        }

        void updateMarks(int m, int p, int c) {
            maths = m;
            physics = p;
            chemistry = c;
        }

        void show() {
            System.out.println(name + " " + regNo + " " + dept);
            System.out.println(maths + " " + physics + " " + chemistry);
            System.out.println("------------");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Surya", 101, "cse");
        Student s2 = new Student("Prabha", 102, "eee");
        Student s3 = new Student("Sri", 103, "bsc");
        s1.updateMarks(80, 85, 90);
        s2.setMaths(70);
        s2.setPhysics(75);
        s2.setChemistry(65);
        s3.updateMarks(88);
        s1.show();
        s2.show();
        s3.show();
    }
}

