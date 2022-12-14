public class Main {
    public static void main(String[] args) {

        String s1 = "x3z ? xYz ! R1 && __";

        System.out.println(s1.replaceAll("[a-z]", "*" ));
        System.out.println(s1.replaceAll("[0-9]", "*" ));
    }
}

/*
    You have a string with the following value: x3z ? xYz ! R1 && __
    with a regular expression, change into * every occurrence of a lowercase letter or of a digit between 0 and 9
    print the result
 */