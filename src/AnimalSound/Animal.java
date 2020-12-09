package AnimalSound;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	int id;
	int age;
	String color;
	
  
 	public Animal(int id ,int age,String color) {
 		
		this.id=id;
		this.age=age;
		this.color=color;
		
	}
 	
 	public Animal() {
 		    
 	 }
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	private String nom;
	private String cri;
	private String type;
	
	
	
	public void ReadSound(String path,String effectSource) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        Path AbsolutePath = FileSystems.getDefault().getPath("").toAbsolutePath();
        String fullPath = AbsolutePath + path;

        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(fullPath));

           Clip clip = AudioSystem.getClip();
           clip.open(audioIn);
           clip.start();
           System.out.println(effectSource+" sound is start ! ");
           System.out.println("s : "+clip.isActive());
           while(clip.isActive()) {
//System.out.println("hola "+effectSource);
}
           clip.close();
           System.out.println(effectSource+" sound is end ! ");
}
	
	
	@Override
	public String toString() {
		return " nom:"+ nom + "\n type:"+ type + "\n cri:" + cri;
	}
}


