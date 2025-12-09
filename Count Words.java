public class CountWords {
    public static void main(String[] args) {
        String s = "I love coding";
        String[] words = s.trim().split("\\s+");
        System.out.println("Words = " + words.length);
    }
}
