import java.util.Random;

//Sort of like RolyPoly but it choses a random order of RPS and sticks with it
public class Permute extends Bot {
    
    
    int[][] permutations = {{0, 1, 2}, {0, 2, 1}, {1, 0, 2}, {1, 2, 0}, {2, 0, 1}, {2, 1, 0}};

    Random orderNo = new Random();
    int order = orderNo.nextInt(permutations.length - 1);

    int[] moves = permutations[order];
    int moveNo = -1;

    @Override
    String choice() {
        if (moveNo >= 2){
            moveNo = 0;
        
        } else {
            moveNo++;
        }

        return rps[moves[moveNo]];
        
    }
}
