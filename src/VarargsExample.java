public class VarargsExample {
    public static  String concat (String... words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word);
            builder.append(" ");
        }
        return builder.toString();
    }
    public static void main (String... args) {
        System.out.println(concat());
        System.out.println(concat("one"));
        System.out.println(concat("one", "two"));
        System.out.println(concat("one", "two", "three"));
    }
    }

