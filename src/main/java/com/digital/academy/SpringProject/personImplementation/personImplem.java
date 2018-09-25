package com.digital.academy.SpringProject.personImplementation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digital.academy.SpringProject.dao.services;
import com.digital.academy.SpringProject.entities.Person;
import com.digital.academy.SpringProject.personInterface.PersonInterface;

@Component
public class personImplem implements PersonInterface {

	@Autowired
	Person person;
	@Autowired
	services servPerson;
	public Person saveD(String name, String surname, String gender) {
	
		person.setName(name);
		person.setSurname(surname);
		person.setGender(gender);
		person.setGender(gender);
		
		return person;
	}

	@Override
	public ArrayList<Person> listOfPeople() {
		return  (ArrayList<Person>) servPerson.findAll();
	}

	@Override
	public ArrayList<String> search(String name) {
	
		ArrayList<String> temp = new ArrayList<String>();
		
		ArrayList<Person> arr = (ArrayList<Person>) servPerson.findAll();
		
		for(Person person : arr) {
			if(person.getName().equalsIgnoreCase(name)) {
				temp.add(person.getName());
			}
		}
		
		return temp;
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		servPerson.deleteById(id);
		
	}

	@Override
	public void returnCnt(int id) {
		// TODO Auto-generated method stub
		servPerson.count();
	}
	
	/*
	public void delete(int id) {
		
		servPerson.deleteById(id);
	}*/

	


}
