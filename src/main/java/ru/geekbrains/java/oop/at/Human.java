package ru.geekbrains.java.oop.at;

public class Human implements Participant {
    private final String name;
    private final Integer maxHeight;
    private final Integer maxLength;
    private boolean isOut;



    public Human() {
        this.maxHeight = 4;
        this.maxLength = 999;
        this.name = "Человек";
    }

    @Override
    public boolean run(Integer a) {
        if (a <= maxLength) {
            System.out.println(name + " пробежал трек, длиной в " + a + " метров");
            return true;
        }
        System.out.println(name + " не пробежал трек, длиной в " + a + " метров");
        System.out.println(name + "выбывает из состязания");
        isOut = true;
        return false;
    }

    @Override
    public boolean jump(Integer a) {
        if (a <= maxHeight) {
            System.out.println(name + " перепрыгнул через " + a + " метровую стену");
            return true;
        }
        System.out.println(name + " не перепрыгнул через " + a + " метровую стену");
        System.out.println(name + " выбывает из состязания" + "\n");
        isOut = true;
        return false;
    }

    @Override
    public boolean isOut() {
        return isOut;
    }
}