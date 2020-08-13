package com.licslan.week00;
/**
 * @author LICSLAN 下定决心学算法与数据结构
 * */
public class Student {

    public Student(Integer age){
        this.age=age;
    }
    private Integer age;

    /**
     * 覆盖之前Object的equals
     * */
    @Override
    public boolean equals(Object o){
        //判断一下条件
        if(this==o) return true;
        if(o==null) return false;
        if(this.getClass()!=o.getClass()) return false;

        Student another = (Student)o;
        return this.age.equals(another.age);
    }


}
