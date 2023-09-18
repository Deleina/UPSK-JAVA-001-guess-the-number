//La palabra clave "super" en Java se utiliza para hacer
// referencia a la clase base (superclase) de la clase actual (subclase).
// Se usa en el contexto de herencia para acceder a miembros (métodos o variables)
//de la clase base cuando hay una relación de herencia entre dos clases.


import java.util.Random;

// se declara como una subclase de la clase Player
public class ComputerPlayer extends Player {
    private Random random = new Random();


    //recibe un parámetro name, que se pasa al constructor de la clase base
    // Player utilizando super(name).
    public ComputerPlayer(String name) {
        super(name);
    }


    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        guesses.add(guess);
        System.out.println(guess);
        return guess;
    }
}