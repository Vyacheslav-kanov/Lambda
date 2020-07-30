public class Main {

   private static Worker worker = new Worker();

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        worker.start();
    }
}
