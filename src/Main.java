public class Main {
    public static void main(String[] args) {

        String x = "ba";
        String x1 = "desserts";
        String x2 = "apple";
        String x3 = "regal";
        String x4 = "war";
        String x5 = "pal";

        String y = "a";
        String y1 = "stressed";
        String y2 = "apple";
        String y3 = "lager";
        String y4 = "raw";
        String y5 = "slap";
        int i = 2;
        int o = 5;

        System.out.println(isExactReverse("ba", "a"));
        System.out.println(isExactReverse("desserts", "stressed"));
        System.out.println(isExactReverse("apple", "apple"));
        System.out.println(isExactReverse("regal", "lager"));
        System.out.println(isExactReverse("war", "raw"));
        System.out.println(isExactReverse("pal", "slap"));
        System.out.println("(" + i + ", " + o + ")");

    }

    public static boolean isExactReverse(String x, String y) {

        if (x.length() == y.length()) {

            for (int i = 0; i <= x.length(); i++) {

                if (x.charAt(i) != y.charAt(y.length() - i - 1)) {
                    return false;
                } else {
                    return true;
                }
            }

        }
        return false;
    }
}
