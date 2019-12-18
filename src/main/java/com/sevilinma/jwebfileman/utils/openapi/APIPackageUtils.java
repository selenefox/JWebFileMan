package com.sevilinma.jwebfileman.utils.openapi;

import com.sevilinma.jwebfileman.utils.openapi.model.APIPackageBean;

import java.util.List;

public class APIPackageUtils {
    public static APIPackageBean createModelObject(int status, String message, Object model){
        APIPackageBean obj = new APIPackageBean();
        obj.setData(model);
        obj.setDatatype(0);
        obj.setStatus(status);
        obj.setMessage(message);
        return obj;
    }

    public static APIPackageBean createModelList(int status, String message, List model){
        APIPackageBean obj = new APIPackageBean();
        obj.setData(model);
        obj.setDatatype(1);
        obj.setStatus(status);
        obj.setMessage(message);
        return obj;
    }
    public static APIPackageBean createModelString(int status, String message, String str){
        APIPackageBean obj = new APIPackageBean();
        obj.setData(str);
        obj.setDatatype(2);
        obj.setStatus(status);
        obj.setMessage(message);
        return obj;
    }
    public static APIPackageBean createModelBoolean(int status, String message, boolean bool){
        APIPackageBean obj = new APIPackageBean();
        obj.setData(bool);
        obj.setDatatype(3);
        obj.setStatus(status);
        obj.setMessage(message);
        return obj;
    }
    public static APIPackageBean createModelNumber(int status, String message, Number number){
        APIPackageBean obj = new APIPackageBean();
        obj.setData(number);
        obj.setDatatype(4);
        obj.setStatus(status);
        obj.setMessage(message);
        return obj;
    }
}
