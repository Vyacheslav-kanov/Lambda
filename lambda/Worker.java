import org.w3c.dom.ls.LSOutput;

public class Worker {

    private OnTaskDoneListener callback = System.out::println;
    private OnTaskErrorListener errorCallback = () -> System.out.println("Crashed!");

    public Worker(OnTaskDoneListener callback){
        this.callback = callback;
    }

    public Worker() {}

    public OnTaskDoneListener getCallback() {
        return callback;
    }

    public void setCallback(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public OnTaskErrorListener getErrorCallback() {
        return errorCallback;
    }

    public void setErrorCallback(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError();
            }else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
