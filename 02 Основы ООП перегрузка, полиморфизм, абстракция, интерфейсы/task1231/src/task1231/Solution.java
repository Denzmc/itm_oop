package task1231;

/* 
Ненужные абстракции
Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
Добавь там, где нужно, и удали там, где они не нужны.


Requirements:
1. Класс Pegasus должен реализовывать интерфейс CanFly.
2. Класс Pegasus должен наследоваться от класса Horse.
3. Класс SwimmingPegasus должен наследоваться от класса Pegasus.
4. Обьект класса Horse создать можно.
5. Обьект класса Pegasus создать можно.
6. Метод swim() класса SwimmingPegasus не должен иметь реализации.*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
        Pegasus pegasus = new Pegasus();
        pegasus.fly();
    }

    public interface CanFly {
        public abstract void fly();
    }

    public static class Horse {
        public void run() {
            System.out.println("run");
        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {
            System.out.println("fly");
        }
    }

    public abstract static class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }

}
