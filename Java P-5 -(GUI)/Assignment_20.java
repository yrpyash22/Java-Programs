
// =========   Java Audio Songs
/* 
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Assignment_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File myFile = new File("Purple Desire - The Grey Room _ Clark Sims.wav");

        try {
            AudioInputStream audioS = AudioSystem.getAudioInputStream(myFile);
            Clip cp = AudioSystem.getClip();
            cp.open(audioS);
            String response = "";
        while (!response.equals("Q")) 
        {
            System.out.println(" P=Play, S=Start, R=Reset, Q=Quit");
            System.out.println("Enter your choice: ");
            response = sc.next();
            response = response.toUpperCase();
            switch (response) {
                case ("P"): cp.start();
                    break;
                case ("S"): cp.stop();
                    break;
                case ("R"): cp.setMicrosecondPosition(0);
                    break;
                case ("Q"): cp.close();
                    break;
                default: System.out.println("Not valid response");
                    break;
            }   
        }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
*/