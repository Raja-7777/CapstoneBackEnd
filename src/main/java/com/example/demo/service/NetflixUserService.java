package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.UserAlreadyExistException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Formdata;
import com.example.demo.model.Users;

public interface NetflixUserService {
	
	public Users registerUser(Users netflixUser) throws UserAlreadyExistException; //post request - save a user record
	public Users findUserbyId(String username) throws UserNotFoundException; // get request - retrieve a record
	public List<Users> getAllUser(); //get request - to retrieve all records
	public Users deleteAUser(String username); //delete request
	public Users updateAUser(Users netflixUser); // PUT - PATCH request
	
	public Formdata formUser(Formdata formdata) throws UserAlreadyExistException;
	
	
	
	
	
	
	
	
	
}

