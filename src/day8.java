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
/*
public class day8{
   record CourseRecord(String dept,String section) {
   }
   }
   static void main(){
     day8.CourseRecord courseRecord=new day8.CourseRecord("Artifical Intelligence","'B' ");
       System.out.println(courseRecord.dept());
       System.out.println(courseRecord.section());

   }*/
  /*  enum LANGUAGE{
    EN ("English"),
    GR ("German"),
    JP ("Japanese"),
    TA ("Tamil");


    String description;
    LANGUAGE(String description){
        this.description = description;
    }
}
static void main(){
    System.out.println(LANGUAGE.EN.description);
    System.out.println(LANGUAGE.GR.description);
    System.out.println(LANGUAGE.JP.description);
    System.out.println(LANGUAGE.TA.description);
}
}*/
    public class day8 {

        sealed interface LoginResult
                permits LoginSuccess, LoginFailure, LoginLoading {
        }

        record LoginSuccess(String time) implements LoginResult {
        }

        record LoginFailure(String reason) implements LoginResult {
        }

        record LoginLoading(String expectedTime) implements LoginResult {
        }

        static void handleLogin(LoginResult result) {
            switch (result) {
                case LoginSuccess success -> System.out.println("Login Success at: " + success.time());

                case LoginFailure failure -> System.out.println("Login Failure because of: " + failure.reason());

                case LoginLoading loading -> System.out.println("Login Loading, " + loading.expectedTime());
            }
        }

        static void main() {

            LoginResult loginSuccess =
                    new LoginSuccess("2026-06-13 03:03:10");

            LoginResult loginFailure =
                    new LoginFailure("Invalid Username or Password");

            LoginResult loginLoading =
                    new LoginLoading("Check after 5 hours");

            handleLogin(loginSuccess);
            handleLogin(loginFailure);
            handleLogin(loginLoading);
        }
    }







