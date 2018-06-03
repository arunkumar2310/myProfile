package com.personal;

public class ArunProfile implements IProfile {
	
	@Override
	public void mybasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"Arun");
		System.out.println(ProfileConstants.LAST_NAME+"Kumar");
		System.out.println(ProfileConstants.AGE+"21");
	}
	@Override
	public void myHobbies() {
		System.out.println("My hobbyies are reading and sight seeing");
				
	}
	
}
