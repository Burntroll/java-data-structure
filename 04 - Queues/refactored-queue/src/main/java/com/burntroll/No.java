package com.burntroll;

public class No<T> {

    private T object;
    private No refNo;

    public No() {

    }

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}