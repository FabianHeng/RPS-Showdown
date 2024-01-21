public class RolyPoly extends Bot {
    public static int rotate = -1;
    
    @Override
    String choice() {
        if (rotate >= 2) {
            rotate = 0;
        } else {
            rotate++;
        }
        return rps[rotate];
    }
}
