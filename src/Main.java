import java.util.*;

public class Main {
    private static final int MAXIMUM_AGE = 75;

    public static void main(String[] args) {
        Random random = new Random();
        Person[] someGuys = new Person[]{
                new Person("Никита", "На выход", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Андрей", "Давай работай", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Сергей", "Труд из обезьяны человека сделал", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Саня", "Работай работай", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Таня", "Пора чай пить", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Лилия", "Попытка не пытка", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Оля", "Пошли домой", random.nextInt(MAXIMUM_AGE) + 1)
        };

        List<Person> peoplesList = new ArrayList<>(List.of(someGuys));
        peoplesList.sort(new PeopleComparator());


        System.out.print("\nСписок на входе:\n");
        for (Person person : someGuys) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
        System.out.print("\nСписок List:\n");
        for (Person person : peoplesList) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }

    }

}

