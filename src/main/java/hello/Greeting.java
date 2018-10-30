package hello;

import java.util.Date;

public class Greeting{
	private final long id;
	private final String content;
	private final Date date;

	public Greeting(long id, String content, Date date){
		this.id = id;
		this.content = content;
		this.date = date;
	}

	public long getId(){
		return id;
	}

	public String getContent(){
		return content;
	}

	public Date getDate(){
		return date;
	}
}
