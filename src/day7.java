/*public class Day7 {

        static class Request{
            private final String name;
            private final String date;
            private final String reason;


             Request(String name, String date, String reason) {
                this.name = name;
                this.date = date;
                this.reason = reason;
            }

            void approved() {
            }

            void reject() {
            }

            void displayDetails() {
                System.out.println("Name   : " + name);
                System.out.println("Date   : " + date);
                System.out.println("Reason : " + reason);
            }
        }

        static class LeaveRequest extends Request {

            LeaveRequest(String name, String date, String reason) {
                super(name, date, reason);
            }

            void approve() {
                System.out.println("Leave request approved.");
            }

            void reject() {
                System.out.println("Leave request rejected.");
            }
        }
       static class LoanRequest extends Request {
            LoanRequest(String name, String date, String reason) {
                super(name, date, reason);
            }
            void approve() {
                System.out.println("Leave request approved.");
            }
            void reject() {
                System.out.println("Leave request rejected.");
            }
        }
        static void main(String[] args) {
            LeaveRequest leaveRequest =
                    new LeaveRequest("surya", "12/04/2025", "Medical Leave");
            leaveRequest.displayDetails();
            leaveRequest.approve();
            System.out.println();
            LoanRequest loanRequest =
                    new LoanRequest("prabha", "1/06/2026", "Education Loan");

            loanRequest.displayDetails();
            loanRequest.reject();
        }
    }*/

public class day7{
    static class payment{
        String amount ;
        void transfer(){
            System.out.println("payment is successfull");
        }
    }
    static class Upipayment extends payment{
        @Override
        void transfer() {
            System.out.println("Upipayment done");
        }
    }
    static class Cardpayment extends payment{
        @Override
        void transfer() {
            System.out.println("Cardpayment done");
        }
    }
    static class Netpayment extends payment{
        @Override
        void transfer() {
            System.out.println("Netpayment done");
        }
    }
    static void main(){
        Upipayment upipayment = new Upipayment();
        upipayment.transfer();

        Cardpayment cardpayment = new Cardpayment();
        cardpayment.transfer();

        Netpayment netpayment = new Netpayment();
        netpayment.transfer();
    }

}