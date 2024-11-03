import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> favs = new ArrayList<>();
        favs.add("HUMBLE");
        favs.add("Red Rising");
        favs.add("Django");
        favs.add("Red Leather");
        favs.add("Better Call Saul");

        favs.remove(2);

        for (String fav : favs) {
            System.out.println(fav);
        }

        favs.reversed();
        favs.removeFirst();
    }
}
