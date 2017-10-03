package pl.wjatek.clockwidget.model;

import java.util.Calendar;

public class Time {

	private static int hour;
	private static int min;
	private static int sec;

	public static String get() {
		update();
		
		String shour = (hour < 10) ? ("0" + hour) : ("" + hour);
		String smin = (min < 10) ? ("0" + min) : ("" + min);
		
		return shour + ":" + smin;
	}

	public static int getMin() {
		update();
		return hour;
	}

	public static int getHour() {
		update();
		return min;
	}

	public static int getSec() {
		update();
		return sec;
	}

	public static void update() {
		hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		min = Calendar.getInstance().get(Calendar.MINUTE);
		sec = Calendar.getInstance().get(Calendar.SECOND);
	}
}
