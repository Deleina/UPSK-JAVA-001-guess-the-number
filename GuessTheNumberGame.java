//public: Significa que es accesible desde cualquier otra clase en cualquier paquete.
//static: su valor es compartido entre todas las instancias de la clase.
//private: Un método privado solo puede ser llamado desde otros métodos dentro de la misma clase

/*Atributos estáticos (static):
  random: Generador de números aleatorios.
  targetNumber: Número aleatorio entre 1 y 100 a adivinar en la partida actual.
*/


import java.util.Random;

public class GuessTheNumberGame {
    private static Random random = new Random();
    static int targetNumber;

    //main(String[] args): Inicia el juego y genera el número aleatorio.
    public static void main(String[] args) {
        initializeGame();
        Player currentPlayer = null; // Inicializa el jugador actual
        while (true) {
            // Cambia entre jugadores en cada turno
            currentPlayer = (currentPlayer == null || currentPlayer instanceof ComputerPlayer) ? new HumanPlayer() : new ComputerPlayer();
            int guess = currentPlayer.makeGuess();
            System.out.println(currentPlayer.getName() + " adivina: " + guess);
            String result = checkGuess(currentPlayer, guess);
            System.out.println(result);
            if (result.equals("¡Correcto!")) {
                System.out.println(currentPlayer.getName() + " ganó. Número secreto: " + targetNumber);
                break;
            }
        }
    }

    static void initializeGame() {
        targetNumber = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        System.out.println("¡Bienvenido a Guess the Number!" + "\uD83D\uDE0E");
        System.out.println("Estoy pensando en un número entre 1 y 100" + "\uD83E\uDD14");
    }

    //checkGuess(Player player): Ejecuta un turno, obtiene la suposición y evalúa el nuevo estado de la partida.
    static String checkGuess(Player player, int guess) {
        if (guess < targetNumber) {
            return "Muy bajo" + "\uD83D\uDE12";
        } else if (guess > targetNumber) {
            return "Muy alto" + "\uD83E\uDD2F";
        } else {
            return "¡Correcto!" + "\uD83D\uDE01";
        }
    }
}




















// main class that contains the logic
/*public class GuessTheNumberGame {

    private static Random random = new Random(); //Declaración de variable estática de tipo random
    private static int targetNumber; //declaracion de variable estatica de tipo int


//Se define el método main, que es el punto de entrada de la aplicación.
// Cuando se ejecuta el programa, este método se llama automáticamente

    public static void main(String[] args) {

        System.out.println("¡Bienvenido a Guess The Number!");

        targetNumber = generateRandomNumber();
        //Llama al método generateRandomNumber() y almacena ese número en la variable targetNumber.

        System.out.println("Número objetivo generado: " + targetNumber);


        //Iniciar y jugar el juego
        Player player = new HumanPlayer("Jugador 1");
        while (true) {
            checkGuess(player);
        }
    }


    //metodo privado
    private static int generateRandomNumber() {
        return random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
    }


    //metodo privado
    private static void checkGuess(Player player) {
        int guess = player.makeGuess();
        System.out.println(player.getName() + " supuso: " + guess);

        if (guess == targetNumber) {
            System.out.println("¡Felicidades, " + player.getName() + "! Has adivinado el número.");
            System.exit(0); // Finaliza el juego
        } else {
            System.out.println("Intenta de nuevo.");
        }
    }
}
*/