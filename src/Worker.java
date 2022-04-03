public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorListener;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorListener) {
        this.callback = callback;
        this.errorListener = errorListener;
    }

    public void start() {
        for (int i=0; i < 100; i++) {
            if (i == 33) {
                errorListener.onError("Task " + i + " is error");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}