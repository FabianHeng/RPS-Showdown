public class JumpShip extends Bot {
    String c = this.random();

    @Override
    void update(String choice, int result) {
        if (result == 0) {
            this.c = this.random();
        } else if (result == 1) {
            switch (choice) {
                case "scissors":
                    this.c = "rock";
                    break;
                case "paper":
                    this.c = "scissors";
                    break;
                case "rock":
                    this.c = "paper";
                    break;
            }
        }
    }

    @Override
    String choice() {
        return this.c;
    }
}
