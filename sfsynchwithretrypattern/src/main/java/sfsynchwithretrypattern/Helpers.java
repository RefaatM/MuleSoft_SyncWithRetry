package sfsynchwithretrypattern;
import java.time.Duration;
import java.time.LocalDateTime;


public class Helpers {
	
	public static long getDuration(LocalDateTime lastTime) {
		LocalDateTime now = LocalDateTime.now();
	    Duration duration = Duration.between(now, lastTime);
	    return Math.abs(duration.toMinutes());
	}

}
