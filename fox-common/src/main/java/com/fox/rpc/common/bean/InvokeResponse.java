package com.fox.rpc.common.bean;

import java.io.Serializable;

/**
 * 封装 RPC 响应
 */
public class InvokeResponse implements Serializable{

    private static final long serialVersionUID = 7581738802316790113L;
    private String requestId;
    private Exception exception;
    private Object result;

    private String serialize;

    public boolean hasException() {
        return exception != null;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getSerialize() {
        return serialize;
    }

    public void setSerialize(String serialize) {
        this.serialize = serialize;
    }

    @Override
    public String toString() {
        return "InvokeResponse{" +
                "requestId='" + requestId + '\'' +
                ", exception=" + exception +
                ", result=" + result +
                '}';
    }
}
