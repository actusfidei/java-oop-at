package ru.geekbrains.java.oop.at;

public interface Participant {
    boolean run(Integer a);

    boolean jump(Integer a);

    boolean isOut();

    default boolean overcome(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            return jump(obstacle.getParameter());
        }
        if (obstacle instanceof Track) {
            return run(obstacle.getParameter());
        }
        return false;
    }
}