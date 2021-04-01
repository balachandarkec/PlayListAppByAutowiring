package autowireBase.model;

public class Song {
	private int id;
	private String title;
	
	public Song() {
	}
	
	public Song(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", title=" + title + "]";
	}
	
	
	

}
