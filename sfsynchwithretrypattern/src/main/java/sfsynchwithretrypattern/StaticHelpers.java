package sfsynchwithretrypattern;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public  class StaticHelpers {
	public static long getDuration(ZonedDateTime lastTime) {
		LocalDateTime now = LocalDateTime.now();
	    Duration duration = Duration.between(now, lastTime.toLocalDateTime());
	    return Math.abs(duration.toMinutes());
	}
	
}
