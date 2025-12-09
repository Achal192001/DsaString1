public class ToggleCase {
    public static void main(String[] args) {
        String s = "AcHaL";
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else
                sb.append(Character.toUpperCase(ch));
        }

        System.out.println(sb.toString());
    }
}
