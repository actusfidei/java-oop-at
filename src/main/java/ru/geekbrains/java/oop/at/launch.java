package ru.geekbrains.java.oop.at;

public class launch {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на состязание! Делайте ваши ставки." + "\n");

        Participant[] participants = {new Human(), new Cat(), new Robot()};

        Obstacle[] obstacles = {
                new Wall(2), new Track(100),
                new Wall(3), new Track(1000),
                new Wall(4), new Track(10000)
        };

        for(Obstacle obs: obstacles){
            for (Participant participant : participants){
                if (!participant.isOut()) {
                    participant.overcome(obs);
                }
            }
            System.out.println("---------------------------");
            System.out.println("Начинаем следующее испытание");
            System.out.println("---------------------------" + "\n");
        }
    }
}