package com.sevilinma.jwebfileman.utils.openapi.model;

public class APIPackageBean extends BaseAPIDataModelBean{
    private int datatype; // 0:object 1:list 2:string 3:bool 4: number
    private Object data; //封装数据
    private long timestamp;

    public APIPackageBean() {
        timestamp = System.currentTimeMillis();
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getDatatype() {
        return datatype;
    }

    public void setDatatype(int datatype) {
        this.datatype = datatype;
    }
}
