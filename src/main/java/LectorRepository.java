import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LectorRepository {
    private List<Lector> lectors = new ArrayList<Lector>();

    public LectorRepository() {
        Lector elke = new Lector("Steegmans", "Elke");
        lectors.add(elke);
        Lector johan = new Lector("Pieck", "Johan");
        lectors.add(johan);
        Lector greetje = new Lector("Jongen", "Greetje");
        lectors.add(greetje);
        Lector david = new Lector("Vandenbroeck", "David");
        lectors.add(david);
    }

    public List<Lector> getAll() {
        return lectors;
    }

    public void add (Lector lector) {
        lectors.add(lector);
    }

    public Lector getRandomLector() {
        Random random = new Random();
        int position = random.nextInt(lectors.size());
        return lectors.get(position);
    }
}
