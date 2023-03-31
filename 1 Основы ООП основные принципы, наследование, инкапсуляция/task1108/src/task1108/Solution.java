package task1108;

/* 
Неприступный кот
Скрой все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.


Requirements:
1. Переменная name класса Cat должна быть скрыта.
2. Переменная age класса Cat должна быть скрыта.
3. Переменная weight класса Cat должна быть скрыта.
4. В Cat должны быть private и public методы.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        public String name;
        public int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
