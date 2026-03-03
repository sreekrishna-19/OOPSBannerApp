public class OOPSBannerApp {

    public static String getLineO(int line) {
        String[] pattern = {"  ***", " * *", " * *", " * *", " * *", " * *", "  ***"};
        return pattern[line];
    }
    public static String getLineP(int line) {
        String[] pattern = {"****", " * *", " * *", "****", " * ", " * ", " * "};
        return pattern[line];
    }
    public static String getLineS(int line) {
        String[] pattern = "****", "* ", "* ", "****", "   *", "   *", "****"};
        String[] sRows = {"****", "* ", "* ", "****", "   *", "   *", "****"};
        return sRows[line];
    }

    public static void main(String[] args) {
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ", getLineO(i), getLineO(i), getLineP(i), getLineS(i));
        }
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
