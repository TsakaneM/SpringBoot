package com.digital.academy.SpringProject.personInterface;

import java.util.ArrayList;

import com.digital.academy.SpringProject.entities.Person;

public interface PersonInterface {

	public Person saveD(String name,String surname,String gender);
	public ArrayList<Person> listOfPeople();
	public ArrayList<String> search(String name);
	public void delete(int id);
	public void returnCnt(int id);
	
}
