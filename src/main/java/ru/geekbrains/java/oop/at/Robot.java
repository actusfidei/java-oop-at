package ru.geekbrains.java.oop.at;

public class Robot implements Participant {
    private String name;
    private final Integer maxHeight;
    private final Integer maxLength;
    private boolean isOut;


    public Robot() {
        this.maxHeight = 15;
        this.maxLength = 15000;
        this.name = "T-1000 model 3";
    }

    @Override
    public boolean run(Integer a) {
        if (a <= maxLength) {
            System.out.println(name + " легко пробежал " + a + " метровый трек");
            return true;
        }
        System.out.println(name + " не преодолел " + a + " метровый трек");
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