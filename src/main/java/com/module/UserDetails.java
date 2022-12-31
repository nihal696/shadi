package com.module;

public class UserDetails {
    private int id;
	private int age;
	private String name;
	private String email;
	private String gender;
	private String country;
	private String city;
	private String mobilenumber;
	
	
	
	public UserDetails(int id, int age, String name, String gender, String email, String country, String city,
			String mobilenumber) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.country = country;
		this.city = city;
		this.mobilenumber = mobilenumber;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ ", country=" + country + ", city=" + city + ", mobilenumber=" + mobilenumber + "]";
	}
	
	

}
