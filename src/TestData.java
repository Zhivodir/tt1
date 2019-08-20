import java.util.Arrays;
import java.util.List;

public class TestData {
    public static final List<Person> PERSONS = Arrays.asList(
            new Person(5, "Мухомор"),
            new Person(6, "Доброжир "),
            new Person(7, "Иркаил "),
            new Person(8, "Серафим"),
            new Person(9, "Агниил "),
            new Person(15, "Мерилл "),
            new Person(14, "Агафий "),
            new Person(13, "Рёрик  "),
            new Person(50, "Святополк"),
            new Person(2, "Баркадий"),
            new Person(1, "Аркадий")
    );

    public static final int[] IDS = new int[]{10, 1, 12, 13, 14, 15};

    public static final List<Person> SORTED_PERSONS = Arrays.asList(
            new Person(1, "Аркадий"),
            new Person(13, "Рёрик  "),
            new Person(14, "Агафий "),
            new Person(15, "Мерилл "),
            new Person(5, "Мухомор"),
            new Person(6, "Доброжир "),
            new Person(7, "Иркаил "),
            new Person(8, "Серафим"),
            new Person(9, "Агниил "),
            new Person(50, "Святополк"),
            new Person(2, "Баркадий")
    );
}
