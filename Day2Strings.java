public class Day2Strings {
    public static void main(String[] args) {
        String all = String.join(",","A","B","C","D"); // joins string
        System.out.println(all);
        System.out.println(all.repeat(2)); // repeats string
        String str; // null
        String empty = ""; // empty, not null
        //System.out.println(str); gives error
        System.out.println(empty); // perfectly fine
        StringBuilder sb = new StringBuilder(); // a mutable string class
        sb.append(4);
        sb.append("string");
        sb.append('c');
        System.out.println(sb);
        String multyLine = """ 
                First
                Second
                Third
                """;
        System.out.println(multyLine); // could also use \n to do the same thing
        String html = """
                <div class="Warning">
                    <p>Beware those who say "Hello" to the world</p>
                </div>
                """;
        System.out.println(html); // very good use case for text blocks

    }
}
