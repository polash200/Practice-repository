import java.util.Scanner;

public class BirthdayWish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the name of your girlfriend
        System.out.print("Enter your girlfriend's name: Tasnim");
        String name = scanner.nextLine();

        // Decorate the message
        String decoration = "🎉✨🎂💕";

        System.out.println("\n" + decoration.repeat(10));
        System.out.println("     🎉 HAPPY BIRTHDAY, " + name.toUpperCase() + "! 🎉");
        System.out.println(decoration.repeat(10) + "\n");

        // Show the message
        System.out.println("Dear " + name + ",\n");
        System.out.println("Wishing you a day as amazing as you are!");
        System.out.println("May your year ahead be filled with love, joy, and success.");
        System.out.println("You make every day special, and today is all about celebrating YOU.\n");
        
        // Add a heart
        System.out.println("     ❤️ ❤️ ❤️  With all my love, ❤️ ❤️ ❤️");
        System.out.println("            - Your Favorite Programmer 😉\n");
        
        // Add some extra love
        System.out.println(decoration.repeat(10));
        System.out.println("       🎂🎁 ENJOY YOUR SPECIAL DAY! 🎁🎂");
        System.out.println(decoration.repeat(10) + "\n");

        scanner.close();
    }
}
