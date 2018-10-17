package labsix;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class MusicGenerator {

  public static void main(String[] args) {

    // TODO: display the name of the programmer and the date
    // TODO: display the welcome message with your theme

    // declare the starting file and scanner
    File inputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      inputsFile = new File("input/music_inputs.txt");
      scanner = new Scanner(inputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }

    // TODO: create your own music strings
    String part1 = "A D E ";
    String part2 = "B B F B ";

    // Read in an instrument and the temp from the text file
    String instrument = scanner.next();
    String tempo = scanner.next();

    // TODO: generate three musical pieces with user's choices
    // The following statements show how to create one piece
    String userChoice = "I[" + instrument + "] T[" + tempo + "] ";
    Pattern piece1 = new Pattern();
    piece1.add(userChoice);
    piece1.add(part1, 2);   // add piece1 two times
    piece1.add(part2);

    // TODO: randomly play one of the three musical pieces
    // The lines below shows how to play the pattern created above
    // You need to add random selection
    System.out.println("Instantiating the player.");
    Player player = new Player();
    player.play(piece1);
  }

}
