public class StrikeThree extends Bot {
    String c = this.random();
    String[] arr = {"", "", ""};
    @Override
    void update(String choice, int result) {
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = choice;
        if (arr[0].equals(arr[1]) && arr[1].equals(arr[2])) {
            switch (choice) {
                case "rock":
                    c = "paper";
                    break;
                case "paper":
                    c = "scissors";
                    break;
                case "scissors":
                    c = "rock";
                    break;
            }
        }
    }
    @Override
    String choice() {
        return c;
    }
}
