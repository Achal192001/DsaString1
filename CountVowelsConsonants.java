public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s = "Achal";
        s = s.toLowerCase();

        int vowels = 0, consonants = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".contains(ch + "")) vowels++;
                else consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
