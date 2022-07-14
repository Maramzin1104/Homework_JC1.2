public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    private int errorNum;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback, int errorNum) {
        this.callback = callback;
        this.errorCallback = errorCallback;
        this.errorNum = errorNum;
    }

    public void start() {
        for (int i = 1; i -1 < 100; i++) {
            if (i == errorNum) {
                errorCallback.onError("Task " + i + " is error");
            } else {
                callback.onDone("Task " + i + " is done");
            }

        }
    }

}