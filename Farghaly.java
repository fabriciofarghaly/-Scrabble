package scrabble;
import java.util.ArrayList;


public class Farghaly implements ScrabbleAI
{
    private static final boolean[] ALL_TILES = {true, true, true, true, true, true, true};

    private GateKeeper gateKeeper;

    @Override
    public void setGateKeeper(GateKeeper gateKeeper)
    {
        this.gateKeeper = gateKeeper;
    }

    @Override
    public ScrabbleMove chooseMove()
    {

        if (gateKeeper.getSquare(Location.CENTER) == Board.DOUBLE_WORD_SCORE)
        {
            return StartSevenTileMove();
        }

        return findThreeTileMove();
    }

    private ScrabbleMove StartSevenTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        String bestWord = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                for (int k = 0; k < hand.size(); k++)
                {
                    for (int l = 0; l < hand.size(); l++)
                    {
                        for (int m = 0; m < hand.size(); m++)
                        {
                            for (int n = 0; n < hand.size(); n++)
                            {
                                for (int o = 0; o < hand.size(); o++) {
                                    if (i != j && i != k && j != k && i != l && j != l && k != l && i != m && j != m && k != m && l != m && i != n && j != n && k != n && l != n && m != n && i != o && j != o && k != o && l != o && m != o && n != o) {
                                        try {
                                            char a = hand.get(i);
                                            if (a == '_') {
                                                a = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                            }
                                            char b = hand.get(j);
                                            if (b == '_') {
                                                b = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                            }
                                            char c = hand.get(k);
                                            if (c == '_') {
                                                c = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                            }
                                            char d = hand.get(l);
                                            if (d == '_') {
                                                d = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                            }
                                            char e = hand.get(m);
                                            if (e == '_') {
                                                e = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                            }
                                            char f = hand.get(n);
                                            if (f == '_') {
                                                f = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                            }
                                            char g = hand.get(o);
                                            if (g == '_') {
                                                g = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                            }
                                            String word = "" + a + b + c + d + e + f + g;
                                            gateKeeper.verifyLegality(word, Location.CENTER, Location.HORIZONTAL);
                                            int score = gateKeeper.score(word, Location.CENTER, Location.HORIZONTAL);
                                            if (score > bestScore) {
                                                bestScore = score;
                                                bestWord = word;
                                            }
                                        } catch (IllegalMoveException e) {
                                            // It wasn't legal; go on to the next one
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (bestScore > -1) {
            return new PlayWord(bestWord, Location.CENTER, Location.HORIZONTAL);
        }
        return StartSixTileMove();
    }


    private ScrabbleMove StartSixTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        String bestWord = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                for (int k = 0; k < hand.size(); k++)
                {
                    for (int l = 0; l < hand.size(); l++)
                    {
                        for (int m = 0; m < hand.size(); m++)
                        {
                            for (int n = 0; n < hand.size(); n++) {
                                if (i != j && i != k && j != k && i != l && j != l && k != l && i != m && j != m && k != m && l != m  && i != n && j != n && k != n && l != n && m != n) {
                                    try {
                                        char a = hand.get(i);
                                        if (a == '_') {
                                            a = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                        }
                                        char b = hand.get(j);
                                        if (b == '_') {
                                            b = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                        }
                                        char c = hand.get(k);
                                        if (c == '_') {
                                            c = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                        }
                                        char d = hand.get(l);
                                        if (d == '_') {
                                            d = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                        }
                                        char e = hand.get(m);
                                        if (e == '_') {
                                            e = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                        }
                                        char f = hand.get(n);
                                        if (f == '_') {
                                            f = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                        }
                                        String word = "" + a + b + c + d + e + f;
                                        gateKeeper.verifyLegality(word, Location.CENTER, Location.HORIZONTAL);
                                        int score = gateKeeper.score(word, Location.CENTER, Location.HORIZONTAL);
                                        if (score > bestScore) {
                                            bestScore = score;
                                            bestWord = word;
                                        }
                                    } catch (IllegalMoveException e) {
                                        // It wasn't legal; go on to the next one
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (bestScore > -1) {
            return new PlayWord(bestWord, Location.CENTER, Location.HORIZONTAL);
        }
        return StartFiveTileMove();
    }

    private ScrabbleMove StartFiveTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        String bestWord = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                for (int k = 0; k < hand.size(); k++)
                {
                    for (int l = 0; l < hand.size(); l++)
                    {
                        for (int m = 0; m < hand.size(); m++) {
                            if (i != j && i != k && j != k && i != l && j != l && k != l && i != m && j != m && k != m && l != m) {
                                try {
                                    char a = hand.get(i);
                                    if (a == '_') {
                                        a = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                    }
                                    char b = hand.get(j);
                                    if (b == '_') {
                                        b = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                    }
                                    char c = hand.get(k);
                                    if (c == '_') {
                                        c = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                    }
                                    char d = hand.get(l);
                                    if (d == '_') {
                                        d = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                    }
                                    char e = hand.get(m);
                                    if (e == '_') {
                                        e = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                    }
                                    String word = "" + a + b + c + d + e;
                                    gateKeeper.verifyLegality(word, Location.CENTER, Location.HORIZONTAL);
                                    int score = gateKeeper.score(word, Location.CENTER, Location.HORIZONTAL);
                                    if (score > bestScore) {
                                        bestScore = score;
                                        bestWord = word;
                                    }
                                } catch (IllegalMoveException e) {
                                    // It wasn't legal; go on to the next one
                                }
                            }
                        }
                    }
                }
            }
        }
        if (bestScore > -1) {
            return new PlayWord(bestWord, Location.CENTER, Location.HORIZONTAL);
        }
        return StartFourTileMove();
    }

    private ScrabbleMove StartFourTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        String bestWord = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                for (int k = 0; k < hand.size(); k++)
                {
                    for (int l = 0; l < hand.size(); l++) {
                        if (i != j && i != k && j != k && i != l && j != l && k!= l) {
                            try {
                                char a = hand.get(i);
                                if (a == '_') {
                                    a = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                }
                                char b = hand.get(j);
                                if (b == '_') {
                                    b = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                }
                                char c = hand.get(k);
                                if (c == '_') {
                                    c = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                }
                                char d = hand.get(l);
                                if (d == '_') {
                                    d = 'E'; // This could be improved slightly by trying all possibilities for the blank
                                }
                                String word = "" + a + b + c + d;
                                gateKeeper.verifyLegality(word, Location.CENTER, Location.HORIZONTAL);
                                int score = gateKeeper.score(word, Location.CENTER, Location.HORIZONTAL);
                                if (score > bestScore) {
                                    bestScore = score;
                                    bestWord = word;
                                }
                            } catch (IllegalMoveException e) {
                                // It wasn't legal; go on to the next one
                            }
                        }
                    }
                }
            }
        }
        if (bestScore > -1) {
            return new PlayWord(bestWord, Location.CENTER, Location.HORIZONTAL);
        }
        return StartThreeTileMove();
    }


    private ScrabbleMove StartThreeTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        String bestWord = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                for (int k = 0; k < hand.size(); k++)
                {
                    if (i != j && i != k && j != k) {
                        try {
                            char a = hand.get(i);
                            if (a == '_') {
                                a = 'E'; // This could be improved slightly by trying all possibilities for the blank
                            }
                            char b = hand.get(j);
                            if (b == '_') {
                                b = 'E'; // This could be improved slightly by trying all possibilities for the blank
                            }
                            char c = hand.get(k);
                            if (c == '_') {
                                c = 'E'; // This could be improved slightly by trying all possibilities for the blank
                            }
                            String word = "" + a + b + c;
                            gateKeeper.verifyLegality(word, Location.CENTER, Location.HORIZONTAL);
                            int score = gateKeeper.score(word, Location.CENTER, Location.HORIZONTAL);
                            if (score > bestScore) {
                                bestScore = score;
                                bestWord = word;
                            }
                        } catch (IllegalMoveException e) {
                            // It wasn't legal; go on to the next one
                        }
                    }
                }
            }
        }
        if (bestScore > -1) {
            return new PlayWord(bestWord, Location.CENTER, Location.HORIZONTAL);
        }
        return StartTwoTileMove();
    }

    /** This is necessary for the first turn, as one-letter words are not allowed. */
    private ScrabbleMove StartTwoTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        String bestWord = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                if (i != j)
                {
                    try {
                        char a = hand.get(i);
                        if (a == '_') {
                            a = 'E'; // This could be improved slightly by trying all possibilities for the blank
                        }
                        char b = hand.get(j);
                        if (b == '_') {
                            b = 'E'; // This could be improved slightly by trying all possibilities for the blank
                        }
                        String word = "" + a + b;
                        gateKeeper.verifyLegality(word, Location.CENTER, Location.HORIZONTAL);
                        int score = gateKeeper.score(word, Location.CENTER, Location.HORIZONTAL);
                        if (score > bestScore) {
                            bestScore = score;
                            bestWord = word;
                        }
                        }
                    catch (IllegalMoveException e)
                    {
                        // It wasn't legal; go on to the next one
                    }
                }
            }
        }
        if (bestScore > -1)
        {
            return new PlayWord(bestWord, Location.CENTER, Location.HORIZONTAL);
        }
        return new ExchangeTiles(ALL_TILES);
    }

    private ScrabbleMove findThreeTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        PlayWord bestMove = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                for (int k = 0; k < hand.size(); k++)
                {
                if (i != j && i != k && j != k)
                {
                    char a = hand.get(i);
                    char b = hand.get(j);
                    char c = hand.get(k);

                    if (a == '_')
                    {
                        a = 'E';
                    }

                    if (b == '_')
                    {
                        b = 'E';
                    }

                    if (c == '_')
                    {
                        c = 'E';
                    }
                    for (String word : new String[]{a + b + c + " ", a + b + " " + c, a + " " + b + c, " " + a + b + c, b + a + c + " ", b + a + " " + c, b + " " + a + c, " " + b + a + c, c + a + b + " ", c + a + " " + b, c + " " + a + b, " " + c + a + b, b + c + a + " ", b + c + " " + a, b + " " + c + a, " " + b + c + a, a + c + b + " ", a + c + " " + b, a + " " + c + b, " " + a + c + b, c + b + a + " ", c + b + " " + a, c + " " + b + a, " " + c + b + a}) {
                        for (int row = 0; row < Board.WIDTH; row++) {
                            for (int col = 0; col < Board.WIDTH; col++) {
                                Location location = new Location(row, col);
                                for (Location direction : new Location[]{Location.HORIZONTAL, Location.VERTICAL}) {
                                    try {
                                        gateKeeper.verifyLegality(word, location, direction);
                                        int score = gateKeeper.score(word, location, direction);
                                        if (score > bestScore) {
                                            bestScore = score;
                                            bestMove = new PlayWord(word, location, direction);
                                        }
                                    } catch (IllegalMoveException e) {
                                        // It wasn't legal; go on to the next one
                                    }
                                }
                            }
                        }
                        }
                    }
                }
            }
        }
        if (bestMove != null)
        {
            return bestMove;
        }
        return findTwoTileMove();
    }

    private ScrabbleMove findTwoTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        PlayWord bestMove = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            for (int j = 0; j < hand.size(); j++)
            {
                if (i != j)
                {
                char a = hand.get(i);
                char b = hand.get(j);

                if (a == '_')
                    {
                    a = 'E';
                    }

                if (b == '_')
                    {
                        b = 'E';
                    }
                    for (String word : new String[]{a + b + " ", a + " " + b, " " + a + b, b + a + " ", b + " " + a, " " + b + a, a + b + " " + " ", a + " " + b + " ", " " + a + b + " ", " " + a + " " + b, " " + " " + a + b, b + a + " " + " ", b + " " + a + " ", " " + b + a + " ", " " + b + " " + a, " " + " " + b + a}) {
                    for (int row = 0; row < Board.WIDTH; row++) {
                        for (int col = 0; col < Board.WIDTH; col++) {
                            Location location = new Location(row, col);
                            for (Location direction : new Location[]{Location.HORIZONTAL, Location.VERTICAL}) {
                                try {
                                    gateKeeper.verifyLegality(word, location, direction);
                                    int score = gateKeeper.score(word, location, direction);
                                    if (score > bestScore) {
                                        bestScore = score;
                                        bestMove = new PlayWord(word, location, direction);
                                    }
                                } catch (IllegalMoveException e) {
                                    // It wasn't legal; go on to the next one
                                }
                            }
                        }
                    }
                }
                }
            }
        }
        if (bestMove != null)
        {
            return bestMove;
        }
        return findOneTileMove();
    }

    private ScrabbleMove findOneTileMove()
    {
        ArrayList<Character> hand = gateKeeper.getHand();
        PlayWord bestMove = null;
        int bestScore = -1;
        for (int i = 0; i < hand.size(); i++)
        {
            char c = hand.get(i);
            if (c == '_')
            {
                c = 'E';
            }
                for (String word : new String[] {c + " ", " " + c, c + " " + " ", " " + c + " ", " " + " " + c, " " + " " + " " + c, " " + " " + c + " ", " " + c + " " + " ", c + " " + " " + " ", c + " " + " " + " " + " ", " " + " " + " " + " " + c, c + " " + " " + " " + " " + " ", " " + " " + " " + " " + " " + c})
                {
                    for (int row = 0; row < Board.WIDTH; row++) {
                        for (int col = 0; col < Board.WIDTH; col++) {
                            Location location = new Location(row, col);
                            for (Location direction : new Location[] {Location.HORIZONTAL, Location.VERTICAL}) {
                                try {
                                    gateKeeper.verifyLegality(word, location, direction);
                                    int score = gateKeeper.score(word, location, direction);
                                    if (score > bestScore) {
                                        bestScore = score;
                                        bestMove = new PlayWord(word, location, direction);
                                    }
                                } catch (IllegalMoveException e) {
                                    // It wasn't legal; go on to the next one
                                }
                            }
                        }
                    }
                }
            }
        if (bestMove != null)
        {
            return bestMove;
        }
        return new ExchangeTiles(ALL_TILES);
    }
}
