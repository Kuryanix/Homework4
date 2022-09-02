public class Main {
    public static void main(String[] args) {
        // ЗАДАЧА 1.1
        int person = 19;
        if (person >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (person <18) {
            System.out.println("Вы еще несовершеннолетний");
        }

        // ЗАДАЧА 1.2
        int child = 14;
        if (child >= 7) {
            System.out.println("Ходит в школу");
        }
        if (child >= 18) {
            System.out.println("Может отправиться в университет");
        }
        if (child >= 24) {
            System.out.println("Пора искать первую работу");
        }

        // ЗАДАЧА 1.3
        int place = 60;
        if (place <= 60) {
            System.out.println("Сидячее место свободно");
        }
        if (place > 60) {
            System.out.println("Сидячих мест нет");
        }
        if (place > 102) {
            System.out.println("Мест нет");
        }

        // ЗАДАЧА 2.1
        if (person >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Вы еще несовершеннолетний");
        }

        // ЗАДАЧА 2.2
        if (child >= 7 && child < 18) {
            System.out.println("Ходит в школу");
        } else if (child >= 18 && child < 24) {
            System.out.println("Может отправиться в университет");
        } else System.out.println("Пора искать первую работу");

        // ЗАДАЧА 2.3
        if (place <= 60) {
            System.out.println("Сидячее место свободно");
        } else if (place >60 && place<= 102) {
            System.out.println("Сидячих мест нет");
        } else {
            System.out.println("Мест нет");
        }

        // ЗАДАЧА 3.1
        if (child >= 2 && child <= 6) {
            System.out.println("Если возраст человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
        } else if (child >= 7 && child <= 18) {
            System.out.println("Если возраст человека равен от 7 до 18 лет, то ему нужно ходить в школу");
        } else if (child >18 && child <=24) {
            System.out.println("Если возраст человека больше 18, но меньше 24 лет, то ему нужно ходит в университет");
        } else {
            System.out.println("Если возраст человека больше 24 лет, то емуПора ходить на работу");
        }

        // ЗАДАЧА 3.2
        int boy = 13;
        if (boy <= 5) {
            System.out.println("Не может кататься на аттракционе");
        } else if (boy > 5 && boy <= 14) {
            System.out.println("Может кататься в сопровождении взрослого");
        } else {
            System.out.println("Может кататься без сопровождения");
        }

        // ЗАДАЧА 3.3
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && one > free) {
            System.out.println("Максимальное число " + one);
        } else if (two > one && two > free) {
            System.out.println("Максимальное число " + two);
        } else {
            System.out.println("Максимальное число " + free);
        }
    }
}
