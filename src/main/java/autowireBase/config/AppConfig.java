package autowireBase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import autowireBase.model.PlayList;
import autowireBase.model.Song;

@Configuration
public class AppConfig {

	@Bean
	public Song SongService() {
		 return new Song();
	}
	
	
	@Bean
	public PlayList playlistService() {
		 return new PlayList();
	}
	
	
}



