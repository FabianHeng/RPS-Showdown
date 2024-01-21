public class Steady extends Bot {
    String c = this.random();

    @Override
    String choice() {
        return c;
    }
}
