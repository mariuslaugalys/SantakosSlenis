public class Strings {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("Labas");
        builder.append(" ");
        builder.append("Pasauli");

        System.out.println(builder.toString());

        {   String a = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

            System.out.println(a.toLowerCase() );
            System.out.println(a.toUpperCase());
            System.out.println(a.replace("o", "z"));
            System.out.println(a.endsWith("elit"));
        }
        {
            String a = "abc";
            String b = "abc";
            String c = new String ("abc");
            String d = "ABC";

            System.out.printf("a = b? %b\n", a==b);
            System.out.printf("a = c? %b\n", a==c);
            System.out.printf("a equals c? %b\n", a.equals(c));
            System.out.printf("a equals d? %b\n", a.equals(d));
            System.out.printf("a equalsIgnoreCase d? %b\n", a.equalsIgnoreCase(d));
        }
    }

}
