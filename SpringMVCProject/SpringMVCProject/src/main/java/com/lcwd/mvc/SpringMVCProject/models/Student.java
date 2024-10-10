package com.lcwd.mvc.SpringMVCProject.models;

public class Student {
    private String name;
    private int Salalry;
    private int Wife;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Salalry=" + Salalry +
                ", Wife=" + Wife +
                '}';
    }

    public int getSalalry() {
        return Salalry;
    }

    public void setSalalry(int salalry) {
        Salalry = salalry;
    }



    public int getWife() {
        return Wife;
    }

    public void setWife(int wife) {
        this.Wife = wife;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
