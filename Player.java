//Las clases abstractas se utilizan como plantillas para
// otras clases y no se pueden instanciar directamente.

//"abstract" indica que esta clase no se puede instanciar directamente,
//sino que se utiliza como una plantilla para otras clases.

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    protected String name;
    protected List<Integer> guesses = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public List<Integer> getGuesses() {
        return guesses;
    }
}
