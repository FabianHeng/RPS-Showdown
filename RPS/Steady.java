import java.util.Random;
public class Steady extends Bot {
    Random random = new Random();
    String c = rps[random.nextInt(rps.length)];

    @Override
    String choice() {
        return c;
    }
}
