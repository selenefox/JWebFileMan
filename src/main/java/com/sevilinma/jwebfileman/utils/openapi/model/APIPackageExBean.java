package com.sevilinma.jwebfileman.utils.openapi.model;

public class APIPackageExBean<T> extends BaseAPIDataModelBean {
    private int datatype; // 0:object 1:list 2:string 3:bool 4: number
    private T data; //封装数据
    private long timestamp;

    public int getDatatype() {
        return datatype;
    }

    public void setDatatype(int datatype) {
        this.datatype = datatype;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
