import java.util.Scanner;

//Propósito: Representa a la jugadora Humana
//La clase HumanPlayer extiende a
//la clase abstracta Player. Esto significa que hereda los atributos
//y métodos definidos en la clase Player.
import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer() {
        super("Jugador Humano");
    }

    @Override
    public int makeGuess() {
        System.out.print("Tu suposición: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}