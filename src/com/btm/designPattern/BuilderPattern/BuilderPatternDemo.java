package com.btm.designPattern.BuilderPattern;

public class BuilderPatternDemo {

    public static void main(String[] args){

        BuilderObject builderObject = new BuilderObject.Builder("王小明").setAge(18).setHeight(1.78f).build();
        System.out.println(builderObject.toString());
    }
}
