    import static org.junit.Assert.*;

    import org.junit.Test;

public class DiceTest
{

        @Test
        public void testDiceDefaultConstructor()
        {
            Dice newDice = new Dice(6);
            assertEquals(6, newDice.getSides());
        }

        @Test
        public void testCustomDiceConstructor()
        {
            Dice newDice = new Dice(20);
            assertEquals(20, newDice.getSides());
        }
        
        @Test
        public void testDiceRoll()
        {
            Dice newDice = new Dice(1);
            assertEquals(1, newDice.Roll());
        }

        @Test
        public void testDiceGetLastRoll()
        {
            Dice newDice = new Dice(1);
            newDice.Roll();
            assertEquals(1, newDice.getLastRoll());
        }

        @Test
        public void testDiceGetSides()
        {
            Dice newDice = new Dice(6);
            assertEquals(6, newDice.getSides());
        }

        @Test
        public void testDiceSetSides()
        {
            Dice newDice = new Dice(6);
            newDice.setSides(20);
            assertEquals(20, newDice.getSides());
        }
    }


