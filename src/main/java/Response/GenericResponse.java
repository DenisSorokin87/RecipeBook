package Response;

import java.util.List;

public class GenericResponse<T> {

    private String status;
    private String msg;
    private List<T> data;

    public GenericResponse() {
    }

    public GenericResponse(String status, String msg, List<T> data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}