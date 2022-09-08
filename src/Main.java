public class Main {
    public static void main(String[] args) {
        //Домашнее задание1
        System.out.println("Домашнее задание1");
        //Задача1
        System.out.println("Задача1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        //Задача2
        System.out.println("Задача2");
        int age1 = 20;
        if (age1 >= 7)
        if (age1 < 18){
            System.out.println("Ребенок ходит в школу.");
        }
        if (age1 >= 18)
        if (age1 < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        if (age1 >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        //Задача3
        System.out.println("Задача3");
        int capacityVan = 102;
        int sittingPlace = 60;
        int standingPlace = capacityVan - sittingPlace;

        int sittingUsed = 62;
        int standingUsed = 50;

        if (sittingPlace > sittingUsed){
            System.out.println("Есть "+ (sittingPlace - sittingUsed) + " сидячих мест.");
        }
        if (sittingPlace < sittingUsed) {
            System.out.println("Сидячих мест нет.");
        }
        if (standingPlace > standingUsed) {
            System.out.println("Есть " + (standingPlace - standingUsed) + " стоячих мест.");
        }
        if (standingPlace < standingUsed) {
            System.out.println("Стоячих мест нет.");
        }

        //Домашнее задание2
        System.out.println("Домашнее задание2");
        //Задача1
        System.out.println("Задача1");
        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        //Задача2
        System.out.println("Задача2");
        int yearsOld = 26;
        if (yearsOld >= 7 && yearsOld < 18){
            System.out.println("Ребенок ходит в школу.");
        } else if (yearsOld >= 18 && yearsOld < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (yearsOld >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        //Задача3
        System.out.println("Задача3");
        int capacityVan1 = 102;
        int sittingPlace1 = 60;
        int standingPlace1 = capacityVan1 - sittingPlace1;

        int sittingUsed1 = 13;
        int standingUsed1 = 11;

        if (sittingPlace1 > sittingUsed1){
            System.out.println("Есть "+ (sittingPlace1 - sittingUsed1) + " сидячих мест.");
        } else  {
            System.out.println("Сидячих мест нет.");
        }
        if (standingPlace1 > standingUsed1) {
            System.out.println("Есть " + (standingPlace1 - standingUsed1) + " стоячих мест.");
        }else  {
            System.out.println("Стоячих мест нет.");
        }

        //Домашнее задание3
        System.out.println("Домашнее задание2");
        //Задача1
        System.out.println("Задача1");
        int ageOfThePerson = 26;
        if (ageOfThePerson >= 2 && ageOfThePerson <= 6){
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в садик.");
        } else if (ageOfThePerson >= 7 && ageOfThePerson <= 18){
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу.");
        } else if (ageOfThePerson >= 19 && ageOfThePerson <= 24){
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в университет.");
        } else if (ageOfThePerson > 24){
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить на работу.");
        }

        //Задача2
        System.out.println("Задача2");
        int ageOfTheChild = 18;
        if (ageOfTheChild <5){
            System.out.println("Если ребенку " + ageOfTheChild + ", то он не может кататься на аттракционе.");
        } else if (ageOfTheChild >=5 && ageOfTheChild < 14){
            System.out.println("Если ребенку " + ageOfTheChild + ", то он может кататься на аттракционетолько в сопровождении взрослого.");
        } else if (ageOfTheChild > 14){
            System.out.println("Если ребенку " + ageOfTheChild + ", то он может кататься на аттракционетолько без сопровождения взрослого.");
        }

        //Задача3
        System.out.println("Задача3");
        int one = 12;
        int two = 15;
        int free = 9;
        if (one > two && one > free){
            System.out.println("Большее число " + one );
        } else if (two > one && two > free){
            System.out.println("Большее число " + two );
        } else if (free > one && free > two){
            System.out.println("Большее число " + free );
        } else if (one == two && two == free){
            System.out.println("Все числа равны.");
        }

    }
}