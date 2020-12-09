package AnimalSound;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class App {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		
		Animal chien = new Chien();

        chien.ReadSound("//audio//chien.wav", "chien1");

	}

}
