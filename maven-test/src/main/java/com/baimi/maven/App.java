package com.baimi.maven;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		int a = 4;
		test(a);
		System.out.printf("%d + %d = %d", a, a, a); //

	}

	public static void test(int a) throws NoSuchFieldException, IllegalAccessException {
		Class cache = Integer.class.getDeclaredClasses()[0]; // 1
		Field myCache = cache.getDeclaredField("cache"); // 2
		myCache.setAccessible(true);// 3
		Integer[] newCache = (Integer[]) myCache.get(cache); // 4
		newCache[132] = newCache[133]; // 5
	}
	
	@Test
	public void test2() {
		
		List<User> list = new ArrayList<User>();
		list.add(new User("a", 2));
		list.add(new User("b", 1));
		list.add(new User("c", 3));
		
		for (User user : list) {
			System.out.println(String.format("name=%s---------age=%d", user.getName(),user.getAge()));
		}
		
		System.out.println("************************");
		Collections.sort(list);
		
		for (User user : list) {
			System.out.println(String.format("name=%s---------age=%d", user.getName(),user.getAge()));
		}

	}
}
