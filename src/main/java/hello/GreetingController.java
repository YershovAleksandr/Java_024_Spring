package hello;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private Date date = new Date();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="Worlds") String name){
		//date = new Date()
		return new Greeting(counter.incrementAndGet(), String.format(template, name), date, (double)date.getSeconds() * 42.);
	}
}
