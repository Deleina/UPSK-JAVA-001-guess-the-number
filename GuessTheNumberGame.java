//public: Significa que es accesible desde cualquier otra clase en cualquier paquete.
//static: su valor es compartido entre todas las instancias de la clase.
//private: Un método privado solo puede ser llamado desde otros métodos dentro de la misma clase


import java.util.Random;


// main class that contains the logic
public class GuessTheNumberGame {

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
