/*La palabra clave "super" en Java se utiliza para hacer
referencia a la clase base (superclase) de la class actual (subclase).
Se usa en el contexto de herencia para acceder a miembros (métodos o variables)
de la clase base cuando hay una relación de herencia entre dos clases.

*/
import java.util.Random;


//Propósito: Representa a la computadora (hereda de Player)

public class ComputerPlayer extends Player {
    public ComputerPlayer() {
        super("Computadora");
    }


    //makeGuess(): Método de cada clase que herada de Player debe implementar.
    @Override
    public int makeGuess() {

        // adivinamos números aleatorios.
        int guess = new Random().nextInt(100) + 1;
        guesses.add(guess);
        return guess;
    }
}

