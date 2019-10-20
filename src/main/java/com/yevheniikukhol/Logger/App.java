package com.yevheniikukhol.Logger;

import com.yevheniikukhol.Logger.Loggers.SimpleLogger;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		SimpleLogger logger = new SimpleLogger("/Users/macbook/Documents/programming/java_project/Logger/Loger/src/main/java/com/yevheniikukhol/Logger/test");
		Scanner in = new Scanner(System.in);
		String str = null;
		str = in.nextLine();
		logger.startLogging(str);
	}
}
