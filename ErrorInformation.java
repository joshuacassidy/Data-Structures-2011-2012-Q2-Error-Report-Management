public class ErrorInformation implements Comparable<ErrorInformation> {
    private String errorID, desc;
    private int priority;

    public ErrorInformation(String errorID, String desc, int priority) {
        this.errorID = errorID;
        this.desc = desc;
        this.priority = priority;
    }

    public String getErrorID() {
        return errorID;
    }

    public void setErrorID(String errorID) {
        this.errorID = errorID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(ErrorInformation o) {
        if (o.getPriority() > priority) {
            return -1;
        } else if(o.getPriority() < priority) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "priority: " + priority;
    }
}
