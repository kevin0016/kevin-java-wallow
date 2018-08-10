package com.itkevin.po;

public class Data {
    private String dataStr;

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    private static class SingletonHolder{
        private static final Data INSTSNCE = new Data();
    }

    private Data() {}
    public static final Data getInstance () {
        return SingletonHolder.INSTSNCE;
    }
}
