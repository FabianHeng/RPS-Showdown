public class Human extends Bot{
    String c = probableChoice(36, 33, 31);

    @Override
    void update(String choice, int result) {
        if (result == 1 && choice == "paper") {
            this.c = probableChoice(14, 41, 45);
        } else if (result == 1 && choice == "scissors") {
            this.c = probableChoice(45, 14, 41);
        } else if (result == 1 && choice == "rock") {
            this.c = probableChoice(41, 45, 14);
        } else if ((result == 2 && choice == "scissors")) {
            this.c = probableChoice(76, 10, 14);
        } else if ((result == 2 && choice == "rock")) {
            this.c = probableChoice(14, 76, 10);
        } else if ((result == 2 && choice == "paper")) {
            this.c = probableChoice(10, 14, 76);
        } else if (result == 0 && choice == "rock") {
            this.c = probableChoice(60, 16, 24);
        } else if (result == 0 && choice == "paper") {
            this.c = probableChoice(24, 60, 16);
        } else if (result == 0 && choice == "scissors") {
            this.c = probableChoice(16, 24, 60);
        }
    }

    @Override
    String choice() {
        return this.c;
    }
}
