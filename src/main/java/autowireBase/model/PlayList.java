package autowireBase.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class PlayList {
	private int id;
	private String name;
	
	@Autowired
	private Song songs;
	
	public PlayList() {
	
	}
	

	public PlayList(int id, String name, Song songs) {
		super();
		this.id = id;
		this.name = name;
		this.songs = songs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Song getSongs() {
		return songs;
	}

	public void setSongs(Song songs) {
		this.songs = songs;
	}


	@Override
	public String toString() {
		return "PlayList [id=" + id + ", name=" + name + ", songs=" + songs + "]";
	}
	
	
	
	
}
