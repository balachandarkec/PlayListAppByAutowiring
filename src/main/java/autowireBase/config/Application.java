package autowireBase.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autowireBase.model.PlayList;
import autowireBase.model.Song;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Song s= config.getBean(Song.class);
		
		s.setId(200);
		s.setTitle("Twinkle");
		System.out.println("Song : " + s.toString());
		
    Song s1= config.getBean(Song.class);
		
		s1.setId(201);
		s1.setTitle("Twinkle Twinkle");
		
		System.out.println("Song : " + s1.toString());
		
		
		PlayList pl= config.getBean(PlayList.class);
		pl.setId(10);
		pl.setName("melody");
		
		pl.setSongs(s);
		System.out.println("Song : " + pl.toString());
	}
}
