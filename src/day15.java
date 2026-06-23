/*public class day15 {
    interface Notification{
        void send(String to, String message);
    }
    class CreditNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Credited 800: "+message+", to"+to);
        }

    }
    class DebitNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Debited 800: "+message+", to"+to);
        }
    }
    static Notification getNotification(day15 factory, String type){
        return switch (type){
            case"Credit"-> factory.new CreditNotification();
            case"Debit"-> factory.new DebitNotification();
            default -> throw new IllegalArgumentException("Invalid account type:"+ type);
        };
    }
    static void main(){
        day15 factory = new day15();
        String type = "Credit";
        getNotification(factory,type).send(" 578969560","Amount 700 0 credited");
    }
}*/

public class day15 {

    interface NewPrinter {
        void print(String text);
    }

    static class OldPrinter {
        void printText(String text) {
            System.out.println("OLD Printer : "+text);
        }
    }

    static class OldPrinterAdapter implements NewPrinter {
        private final OldPrinter printer;
        OldPrinterAdapter(OldPrinter printer) {
            this.printer = printer;
        }

        @Override
        public void print(String text){
            printer.printText(text);
        }
    }

    static void main() {
        NewPrinter printer = new OldPrinterAdapter(new OldPrinter());
        printer.print("Hello World");
    }
}