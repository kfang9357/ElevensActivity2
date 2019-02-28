import java.util.ArrayList;
import java.util.List;

public class Shuffler {

    public static void perfectShuffle(int[] cards)
    {
        //int[]shuffled = new int[52];

        List<Integer> shuffled = new ArrayList<Integer>();

        int k = 0;
        for (int j =0; j<25; j++)
        {
            shuffled.set(k,cards[j]);
            k+=2;
        }

        k=1;
        for (int j = 26; j<51; j++)
        {
            shuffled.set(k,cards[j]);
            k+=2;
        }
    }

    public static void selecionShuffle(int[]cards)
    {
        List<Integer> shuffled = new ArrayList<Integer>();
        for (int k = 0; k<51; k++)
        {
            int j = (int)(Math.random()*52);
            if (cards[j]  null)
            {
               shuffled.set(k,cards[j]);
               //cards.remove(j);
            }
        }
    }

}
