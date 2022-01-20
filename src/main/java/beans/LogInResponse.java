package beans;

public class LogInResponse {
    private LoggedInUser loggedInUser;
    private String status;
    private String error;

    public LogInResponse() {
    }

    public LogInResponse(LoggedInUser loggedInUser, String status) {
        this.loggedInUser = loggedInUser;
        this.status = status;
    }

    public LogInResponse(String error, String status) {
        this.error = error;
        this.status = status;
    }

    public LoggedInUser getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(LoggedInUser loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
