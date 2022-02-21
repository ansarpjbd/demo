package com.capgmini.helloworld;

//Package--it will be first line of class
//it will tell class belong to which package 
//POJO --Plain old Java Object
    //it does not contain business logic
//Rule- Public class name and filename should be same
//One Java File can have multiple classes 
//it no access modifer is given then by default it will default
//a class can contain variable , method ,nested class
//class--class is blueprint which help us to show the  
//Class Name start with Upper Class and AnyName connecting name also be upper
//Variable name will start with lower case
//Method name will start with lowercase and anyconnecting word willbe upper case
class Person {
//variable
	private String name;
	private int age;
//method
//nested class	

//set the value to properties
//setter method
//Constructor
//Using user defined Method

//method
//Constructor--it is used to set the value of object
//it is special method
//because it has the same name as class name
//You do not have call the constructor 
//
//default constructor
//it is created by the compiler 
	Person() {

	}

	// Constructor with parameters
	// this is keyword
	// this--used to access the method and member of same class
	// Constructor will called automatically whenever we are creating the object of
	// class
	// Method with same name and different parameters
	// method overloading
	// Constructor Overloading
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Person(String name) {
		this.name = name;
	}

	Person(int age) {
		this.age = age;
	}

	// Setter Method
	// it is start with set and then variable
	// Setter for Name
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setValue(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		// int name;
		System.out.println("Name " + this.name);
		System.out.println("age " + this.age);
	}

}

public class MyClass {

	public static void main(String args[]) {
		// Object
		// Ansar --Object is any real world entity which has same attribute and
		// behaviour
        //Class name    object name   assigment new constructor
		Person           ansar = new Person();
		ansar.setValue("Ansar", 35);
		ansar.print();
		// ansar.age=10;
	}
}
