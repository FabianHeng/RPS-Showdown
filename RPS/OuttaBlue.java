public class OuttaBlue extends Bot {
    String c = "paper";

    @Override
    void update(String choice, int result) {
        if (result == 2) {
            this.c = choice;
        } else {
            if (choice == "paper" && c == "paper") {
                this.c = probableChoice(50, 0, 50);
            } else if (choice == "paper" && c == "rock") {
                this.c = "scissors";
            } else if (choice == "rock" && c == "rock") {
                this.c = probableChoice(0, 50, 50);
            } else if (choice == "rock" && c == "scissors") {
                this.c = "paper";
            } else if (choice == "scissors" && c == "scissors") {
                this.c = probableChoice(50, 50, 0);
            } else if (choice == "scissors" && c == "paper") {
                this.c = "rock";
            }
        }
    }

    @Override
    String choice() {
        return this.c;
    }
}
