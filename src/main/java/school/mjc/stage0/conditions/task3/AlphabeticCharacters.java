package school.mjc.stage0.conditions.task3;

import java.util.List;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String vowel;
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        if (vowels.contains(String.valueOf(character).toLowerCase())) {
            vowel = "Vowel";
        } else if (consonants.contains(String.valueOf(character).toLowerCase())) {
            vowel = "Consonant";
        } else {
            vowel = "wrong alphabet!";
        }
        System.out.println(vowel);
    }
}
