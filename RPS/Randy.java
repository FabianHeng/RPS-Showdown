import java.util.Random;
public class Randy extends Bot {
    Random random = new Random();

    @Override
    String choice() {
        return rps[random.nextInt(rps.length)];
    }
}