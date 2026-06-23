public class day15_java {
    static void main() throws InterruptedException {
        Runnable chefTask =() -> {
            String [] items ={ "burger","noodles","coffee"};
            for (int i=0; i < items.length;i++){
                System.out.println("cooking Item:"+ items [i]);
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            }
        };
        Thread chefThread= new Thread(chefTask,"chef-Thread");
        chefThread.start();
        chefThread.join();
    }
}
