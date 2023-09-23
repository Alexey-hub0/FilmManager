import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FilmItem;
import ru.netology.javaqa.FilmManager;

public class FilmManagerTest {

    FilmItem item1 = new FilmItem("Бладшот");
    FilmItem item2 = new FilmItem("Вперёд");
    FilmItem item3 = new FilmItem("Отель Белград");
    FilmItem item4 = new FilmItem("Джентельмены");
    FilmItem item5 = new FilmItem("Человек-невидимка");
    FilmItem item6 = new FilmItem("Номер один");


    @Test
    public void testFindAll() {
        FilmManager repo = new FilmManager();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        FilmItem[] expected = {item1, item2, item3};
        FilmItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastEqualsLimit() {
        FilmManager repo = new FilmManager();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);

        FilmItem[] expected = {item5, item4, item3, item2, item1};
        FilmItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastAboveLimit() {
        FilmManager repo = new FilmManager();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);

        FilmItem[] expected = {item6, item5, item4, item3, item2};
        FilmItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastUnderLimit() {
        FilmManager repo = new FilmManager();
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);

        FilmItem[] expected = {item4, item3, item2, item1};
        FilmItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
