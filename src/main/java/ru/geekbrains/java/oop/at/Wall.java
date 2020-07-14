package ru.geekbrains.java.oop.at;

public class Wall extends Obstacle {
    Integer height;

    public Wall(Integer height) {
        this.height = height;
    }


    @Override
    public Integer getParameter() {
        return height;
    }
}