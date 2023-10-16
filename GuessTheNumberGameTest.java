import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class GuessTheNumberGameTest {
    private GuessTheNumberGame game;

    //@Before: anotación que  indica que el método setUp se ejecutará antes de cada prueba.
    //setUp se ejecuta antes de cada prueba
    @Before
    public void setUp() {
        game = new GuessTheNumberGame();

    }

    @Test
    public void testCheckGuessCorrect() {

        GuessTheNumberGame.targetNumber = 42;


        assertEquals("¡Correcto!😁", game.checkGuess(null, 42));
    }

    @Test
    public void testCheckGuessTooLow() {

        GuessTheNumberGame.targetNumber = 50;


        assertEquals("Muy bajo" + "\uD83D\uDE12", game.checkGuess(null, 30));
    }

    @Test
    public void testCheckGuessTooHigh() {

        GuessTheNumberGame.targetNumber = 20;


        assertEquals("Muy alto" + "\uD83E\uDD2F", game.checkGuess(null, 30));
    }
}