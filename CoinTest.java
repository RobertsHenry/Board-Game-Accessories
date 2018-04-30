  import static org.junit.Assert.*;

    import org.junit.Test;

public class CoinTest
{

        @Test
        public void testCoinDefaultConstructor()
        {
            Coin newCoin = new Coin();
            assertFalse(newCoin == null);
        }

        @Test
        public void testCoinFlip()
        {
            Coin newCoin = new Coin();
            assertEquals("Heads", newCoin.Flip());
        }

        @Test
        public void testCoinGetLastFlip()
        {
            Coin newCoin = new Coin();
            newCoin.Flip();
            assertEquals("Heads", newCoin.lastFlip);
        }
    
}
