package com.Duanwu;



    /*要求：有三种交通工具飞机、轮船、汽车
         它们有各自的行驶方式（水、路、空）
         它们有各自的载人数量
         它们有各自的行驶速度
         只有轮船和汽车可以打开窗子
         用多态和接口实现：*/


public class Car extends Transportation implements OpenWidow {
    public void Howwork(String b) {
        this.setWork(b);
        System.out.println("方式：" + getWork());
    }

    public void HMseat(int a) {
        this.setSeat(a);
        System.out.println("人数：" + getSeat());
    }

    public void HMspeed(double c) {
        this.setSpeed(c);
        System.out.println("速度：" + getSpeed());
    }
    public void open(){
        System.out.println();
    }
}

