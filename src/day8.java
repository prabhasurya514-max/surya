import java.sql.SQLOutput;

/*public class day8 {

    interface Employee {
        void solveProblem();

        void work();
    }
                public class BankEmployee implements Employee{
        String name;
        String id;
        int salary;
        BankEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        @Override
        public void solveProblem() {
            System.out.println(name + " is solving banking problems");
        }
        @Override
        public void work() {
            System.out.println(name + " is working in the bank");
        }
    }
    static class checkingEmployee implements Employee {
        String name;
        String id;
        int salary;
        checkingEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        @Override
        public void solveProblem() {
            System.out.println(name + " is checking customer accounts");
        }
        @Override
        public void work() {
            System.out.println(name + " is performing checking operations");
        }
    }
    public staticvoidmain(String[] args) {
        Employee emp1 = new BankEmployee("surya", "31", 5000);
        Employee emp2 = new checkingEmployee("prabha", "32A", 45000);
        emp1.work();
        System.out.println();
        emp1.solveProblem();
        emp2.work();
        System.out.println();
        emp2.solveProblem();


    }
}*/
public class day8{
   record CourseRecord(String dept,String section) {
   }
   }
   static void main(){
     day8.CourseRecord courseRecord=new day8.CourseRecord("Artifical Intelligence","'B' ");
       System.out.println(courseRecord.dept());
       System.out.println(courseRecord.section());

   }





