public class hardcode {
    public static int discount(String membership) {
        if (membership.equals("GOLD")) {
            return 20;
        } else if (membership.equals("SILVER")) {
            return 10;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(discount("GOLD"));
    }
}
