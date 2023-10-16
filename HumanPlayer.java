import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name) {

        super(name);
    }

    @Override
    public int makeGuess() {
        System.out.print("Ingresa tu suposición: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}