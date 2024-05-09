package com.clocke.calc;

public class TestClocke {
	
	public static boolean testAngleForTime_0245() {
		 double angle = Clocke.getClockAngle(new String[] {"0245"});
		 System.out.println("Angle is - " + angle);
		 return angle  == 187.5;
    }
	
	public static boolean testAngleForTime_1745() {
		double angle = Clocke.getClockAngle(new String[] {"1754"});
		System.out.println("Angle is - " + angle);
		 return angle  == 147;
    }


    public static void main(String[] args) {
    	if (testAngleForTime_0245() && testAngleForTime_1745()) 
    		System.out.println("Test Passed");
    	else
    		System.out.println("Test Failed");
    	
    }


	
}
