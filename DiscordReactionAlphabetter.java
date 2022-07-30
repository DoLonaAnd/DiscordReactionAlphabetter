import java.util.Scanner;

public class DiscordReactionAlphabetter {
    //fields
    private char[] alphabets;

    //constructors
    public DiscordReactionAlphabetter(char[] alphabets) {
        this.alphabets = alphabets;
    }

    public void alphabetPrint() {
        System.out.println();
        for(char alph : alphabets) {
            System.out.print(":regional_indicator_" + alph + ": ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);
        boolean loop = true, loop2 = false;
        String key = "";
        while(loop){
            System.out.print("\u001b[0mEnter alphabets: \u001b[31m");
            key = keyBoardScanner.next().toLowerCase();
            System.out.print("\u001b[0m");
            char[] alphabets = new char[key.length()];
            for(int i = 0; i < key.length(); i++){
                alphabets[i] = key.charAt(i);
            }
            DiscordReactionAlphabetter discordReactionAlphabetter = new DiscordReactionAlphabetter(alphabets);
            discordReactionAlphabetter.alphabetPrint();
            System.out.print("One more change? (y/n): \u001b[31m");
            if(keyBoardScanner.next().equals("n")){
                loop = false;
            }
        }
        keyBoardScanner.close(); 
    }
}
