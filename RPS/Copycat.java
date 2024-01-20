public class Copycat extends Bot {
    String choice;

    @Override
    void update(String choice, int result) {
        this.choice = choice;
    }

    @Override
    String choice() {
        if (choice != null) {
            return choice;
        } else {
            return "scissors";
        }
    }
}
