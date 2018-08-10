package com.itkevin;

import com.itkevin.po.Data;

public class multithreading {
    public static void main(String[] args) {
        Data instance = Data.getInstance();

        new Thread(()->{
            try {
                Thread.sleep(5000);
                instance.setDataStr("1");
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();


        new Thread(()->{
            int times = 0;
            try {
                while (true){
                    if("1".equals(instance.getDataStr())){
                        System.out.println("success");
                    }
                    times++;
                    System.out.println("这是第"+times+"次");
                    Thread.sleep(500);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }
}
