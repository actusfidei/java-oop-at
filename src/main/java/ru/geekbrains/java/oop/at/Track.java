package ru.geekbrains.java.oop.at;

public class Track extends Obstacle {
    Integer length;

    public Track(Integer length) {
        this.length = length;
    }


    @Override
    public Integer getParameter() {
        return length;
    }
}