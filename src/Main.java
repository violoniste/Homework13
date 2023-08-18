import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Author lev = new Author("Лев", "Толстой");
        Author aleksey = new Author("Алексей", "Толстой");

        Book warAndPeace = new Book("Война и мир", lev, 1865);
        Book aelita = new Book("Аэлита", aleksey, 1923);

        warAndPeace.setYear(1869);

        System.out.println(aelita);
    }
}