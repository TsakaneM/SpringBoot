package com.digital.academy.SpringProject.apicontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digital.academy.SpringProject.dao.services;
import com.digital.academy.SpringProject.entities.Person;
import com.digital.academy.SpringProject.personImplementation.personImplem;

@RestController
@RequestMapping("/digi")
public class EntryPoint {
	
	@Autowired
	personImplem perImp;
	@Autowired
	services persServ;
	
	@PostMapping("/save")
	public Person Saveobj(@RequestParam String name,@RequestParam String surname,@RequestParam String gender){		
		return persServ.save(perImp.saveD(name, surname, gender)) ;
		}
	
	@PostMapping("/list")
	public ArrayList<Person> list(){
		return  perImp.listOfPeople();
		}
	

	@PostMapping("/search")
	public ArrayList<String> search(@RequestParam String name) {
		
		
		return  perImp.search(name);
		}
	@PostMapping("/delete")
	public void delete(int id) {
		
		perImp.delete(id);
		}
	@PostMapping("/count")
	public void returnCnt(int id) {
		perImp.returnCnt(id);
		String str ="succefully deleted";
	}


}
