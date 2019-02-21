package com.btm.designPattern.BuilderPattern;

public class BuilderObject {

    private String name;
    private int age;
    private int sex;
    private float height;
    private float weight;

    public static class Builder{

        private String name;
        private int age;
        private int sex;
        private float height;
        private float weight;

        public Builder(String name){
            this.name = name;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setSex(int sex){
            this.sex = sex;
            return this;
        }

        public Builder setHeight(float height){
            this.height = height;
            return this;
        }

        public Builder setWeight(float weight){
            this.weight = weight;
            return this;
        }

        public BuilderObject build(){
            return new BuilderObject(this);
        }
    }

    public BuilderObject(){

    }

    public BuilderObject(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("姓名：").append(this.name)
                .append("年龄：").append(this.age)
                .append("性别：").append(this.sex)
                .append("身高：").append(this.height)
                .append("体重：").append(this.weight);
        return stringBuffer.toString();
    }
}
