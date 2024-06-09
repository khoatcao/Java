public class Loop {
    public int CountDown() {
        int countdown = 3;
        while (countdown > 0) {
            if (countdown > 2) {
                break;
            }
            System.out.println(countdown);
            countdown --;
        }
        return countdown;
    }

    public static void main(String [] args) {
        Loop loop = new Loop();
        int ct = loop.CountDown();
        System.out.println(ct);

    }
}