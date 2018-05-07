package com.baimi.maven;

/**   
* @author phf   
* @date 2018年4月27日
*/
public class User implements Comparable<User>{
	
	private String name;
	
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(User o) {
		return o.name.compareTo(name);
	}

	@Override
	public boolean equals(Object obj) {
		return ((User) obj).getAge() == this.age;
	}
	
	
	

}
