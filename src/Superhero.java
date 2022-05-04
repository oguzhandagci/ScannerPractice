import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero.\n" +
                "Who is the hero of our story?");
        String text1 = scanner.nextLine();
        System.out.println("What is their superpower?");
        String text2 = scanner.nextLine();
        System.out.println(
                "Here is the story: \n" +
                        "There once was a superhero named " + text1 +
                        ", who had the power of " + text2 + ".\n" +
                        "As they grew older, " + text1 + " saw that the world needed them.\n"
                        + text1 + " used their ability to " + text2 + " to save the world."
        );
        scanner.close();
    }
}
