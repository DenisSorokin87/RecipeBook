package Response;

import java.util.List;

public class GenericResponse<E> {

    private String status;
    private String msg;
    private List<E> dataList;

    public GenericResponse() {
    }

    public GenericResponse(String status, String msg, List<E> dataList) {
        this.status = status;
        this.msg = msg;
        this.dataList = dataList;
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

    public List<E> getDataList() {
        return dataList;
    }

    public void setDataList(List<E> dataList) {
        this.dataList = dataList;
    }
}