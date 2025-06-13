package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello welcome to devops classes,we are lerning jenkins CI-CD Tool for automation of jobs! Today Date is:  " + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "techno smart";
		return new Date();

	}

}
