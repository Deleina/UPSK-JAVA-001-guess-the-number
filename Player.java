//Las clases abstractas se utilizan como plantillas para
// otras clases y no se pueden instanciar directamente.

//"abstract" indica que esta clase no se puede instanciar directamente,
//sino que se utiliza como una plantilla para otras clases.

/*
Player
Propósito: Representa a una jugadora genérica. Es una clase abstracta. Define los
atributos y métodos que todas las clases de jugadoras deberían compartir:
*/


import java.util.ArrayList;
import java.util.List;


public abstract class Player {

    //name: El nombre de la jugadora.
    private String name;

    //El historial de suposiciones de la jugadora.
    protected List<Integer> guesses = new ArrayList<>();

    public Player(String name) {

        this.name = name;
    }

    //Devuelve la suposición de la jugadora. Es un método abstracto.
    public abstract int makeGuess();

    //Devuelve el nombre de la jugadora.
    public String getName() {

        return name;
    }

    //Devuelve el historial de suposiciones de la jugadora.
    public List<Integer> getGuesses() {

        return guesses;
    }
}