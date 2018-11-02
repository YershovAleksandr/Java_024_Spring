package hello;

import java.util.Date;

public class Greeting{
	private final long id;
	private final String content;
	private final Date date;
	private final double percent;

	public Greeting(long id, String content, Date date, Double percent){
		this.id = id;
		this.content = content;
		this.date = date;
		this.percent = percent;
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

	public double getPercent(){
		return percent;
	}
}
