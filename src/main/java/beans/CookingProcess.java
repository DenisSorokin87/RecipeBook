package beans;

public class CookingProcess {

     private int processId;
     private int  processNumber;
     private String description;

    public CookingProcess() {
    }

    public CookingProcess(int processId, int processNumber, String description) {
        this.processId = processId;
        this.processNumber = processNumber;
        this.description = description;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getProcessNumber() {
        return processNumber;
    }

    public void setProcessNumber(int processNumber) {
        this.processNumber = processNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
