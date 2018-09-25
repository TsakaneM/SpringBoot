package com.digital.academy.SpringProject.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.digital.academy.SpringProject.entities.Person;

@Service
@Transactional
@Component
public interface services extends CrudRepository<Person,Integer> {
	
	//INSERT
	//UPDATE
	//DELETE
	//SELECT

}
