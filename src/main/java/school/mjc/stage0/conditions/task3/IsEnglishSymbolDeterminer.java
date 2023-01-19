package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String english;
        String englishSymbols = "abcdefghijkmnopqrstuvwxyz";
        if (englishSymbols.contains(String.valueOf(symbol).toLowerCase())) {
            english = "English";
        } else {
            english = "Non English";
        }
        System.out.println(english);
    }
}
