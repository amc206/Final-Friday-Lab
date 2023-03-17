import org.example.dice.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertSame;

public class DiceTest
{

    @Test
    public void constructorTest()
    {
        Dice testDice = new Dice(1, "red");

        assertAll(
                () -> assertEquals(4, testDice.getSides()),
                () -> assertEquals("green", testDice.getColor()),
                () -> assertNull(testMe.getTitle()),
                () -> assertSame('\u0000', testMe.getMiddle())
        );
    }


}
