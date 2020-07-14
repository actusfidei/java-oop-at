package ru.geekbrains.java.oop.at;

public class Cat implements Participant {
    private final String name;
    private final Integer maxHeight;
    private final Integer maxLength;
    private boolean isOut;


    public Cat() {
        this.maxHeight = 5;
        this.maxLength = 101;
        this.name = "Котик";
    }

    @Override
    public boolean run(Integer a) {
        if (a <= maxLength) {
            System.out.println(name + " преодолел " + a + " метровый трэк");
            return true;
        }
        System.out.println(name + " не преодолел " + a + " метровый трэк");
        System.out.println(name + "выбывает из состязания" + "\n");
        isOut = true;
        return false;
    }

    @Override
    public boolean jump(Integer a) {
        if (a <= maxHeight) {
            System.out.println(name + " перепрыгнул " + a + " метровую стену");
            return true;
        }
        System.out.println(name + " не перепрыгнул " + a + " метровую стену");
        System.out.println(name + " выбывает из состязания" + "\n");
        isOut = true;
        return false;
    }

    @Override
    public boolean isOut() {
        return isOut;
    }

}