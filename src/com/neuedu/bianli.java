package com.neuedu;

import java.util.HashMap;
import java.util.Map;

public class bianli {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        //1.遍历集合，并将序号与对应人名打印。
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        System.out.println("================");
        //3.移除该map中的编号为1的信息
        map.remove(1);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        System.out.println("================");
        //4.将map集合中编号为2的姓名信息修改为"周林"
        map.put(2,"周林");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
