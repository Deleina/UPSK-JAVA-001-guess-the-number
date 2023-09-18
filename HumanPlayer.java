import java.util.Scanner;


//La clase HumanPlayer extiende
//la clase abstracta Player. Esto significa que hereda los atributos
//y métodos definidos en la clase Player.
public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);
    // Crea una instancia de Scanner para leer la entrada del usuario


    // Constructor de la clase HumanPlayer
    public HumanPlayer(String name) {
        super(name);
        // Llama al constructor de la clase base (Player)
        // y pasa el nombre del jugador
    }

    //método abstracto makeGuess de la clase Player
    @Override
    public int makeGuess() {
        System.out.print(name + ", ingresa tu suposición: ");
        int guess = scanner.nextInt();
        // la suposición ingresada por el jugador desde la entrada estándar
        guesses.add(guess);
        return guess;
    }
}