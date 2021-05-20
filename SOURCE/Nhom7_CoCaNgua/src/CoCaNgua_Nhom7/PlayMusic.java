package CoCaNgua_Nhom7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayMusic {

	public static void playmusic(String filepath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File(filepath);
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip=AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
		
	}
	
//public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
//	Scanner scanner = new Scanner(System.in);
//	PlayMusic pMusic= new PlayMusic();
//	pMusic.playmusic("happy.wav");
//	String responseString = scanner.nextLine();
//}

}
