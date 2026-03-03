import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {
    
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
            " **** ", "*    *", "*    *", "*    *", 
            "*    *", "*    *", " **** "
        });
        patternMap.put('P', new String[]{
            "***** ", "*   * ", "*   * ", "***** ", 
            "*     ", "*     ", "*     "
        });
        patternMap.put('S', new String[]{
            " *****", "*     ", "*     ", " *****", 
            "     * ", "     * ", " *****"
        });

        String[] bannerLines = new String[7];
        char[] word = {'O', 'O', 'P', 'S'};
        
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word) {
                line.append(patternMap.get(c)[i]);
                if (c != 'S') line.append(" ");
            }
            bannerLines[i] = line.toString();
        }
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
