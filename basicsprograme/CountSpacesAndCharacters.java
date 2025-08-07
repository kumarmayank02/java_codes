import java.util.Scanner;
class CountSpacesAndCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        
        int spaceCount = 0;
        int charCount = input.length(); // Total characters including spaces
        
        // Counting spaces
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        
        // Displaying results
        System.out.println("Total number of characters: " + charCount);
        System.out.println("Total number of blank spaces: " + spaceCount);
        
        scanner.close();
    }
}
