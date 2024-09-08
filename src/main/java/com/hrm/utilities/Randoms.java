package com.hrm.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class Randoms {

	public static String name() {
		String name = RandomStringUtils.randomAlphabetic(7);
		return name;
	}
	
	public static String valid_emails() {
		String email = RandomStringUtils.randomAlphabetic(7) + "@gmail.com";
		return email;
	}
}
