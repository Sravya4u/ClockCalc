package com.clocke.calc;

public class Clocke {

	public static void main(String[] args) {

		System.out.println("Angle between hour hand and minute hand clockwise - "
				+getClockAngle(args)  + "°");

	}

	public static double getClockAngle(String[] args) {
		int hours = Integer.valueOf(args[0].substring(0, 2));
		int minutes = Integer.valueOf(args[0].substring(2));
		System.out.println("Input time is - " + hours + ":" + minutes);
		return calcuateAngleClockwise(getHoursInTwelveHourFormat(hours), minutes);
		
	}

	private static int getHoursInTwelveHourFormat(int hours) {
		hours = hours > 12 ? hours = ((hours + 11) % 12) + 1 : hours;
		return hours;
	}

	/**
	 * This method calculate angle of hour hand and minute hand w.r.t 12 and
	 * subtract the both to get angle between both hands clock wise
	 * 
	 * @param hours
	 * @param minutes
	 * @return
	 */
	private static double calcuateAngleClockwise(int hours, int minutes) {

		// A minute hand moves 6° each minute
		// An hour hand moves 0.5° each minute and 30° each hour

		float angleForMinuteHand = 6 * (minutes);
		double angleForHourHand = (30 * hours) + (0.5 * minutes);

		double angleBetweenTwohands = angleForMinuteHand - angleForHourHand;
		
		// If angle between hands is negative it is considered anti-clockwise and hence
		// we need to subtract from 360 degrees to get the clockwise angle
		double hourToMinuteHandAngle = Math.signum(angleBetweenTwohands) > 0 ? angleBetweenTwohands
				: 360 - Math.abs(angleBetweenTwohands);

		return hourToMinuteHandAngle;
	}

}