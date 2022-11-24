package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.UserAlreadyExistException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Formdata;
import com.example.demo.model.Users;
import com.example.demo.repository.FormdataRepo;
import com.example.demo.repository.NetflixUserRepo;

@Service
public class NetflixUserServiceImpl implements NetflixUserService {
	
	@Autowired
	NetflixUserRepo NetflixRepo;
	
	@Autowired
	FormdataRepo formRepo;
	
	@Override
	public Users registerUser(Users netflixUser) throws UserAlreadyExistException {
		return NetflixRepo.save(netflixUser);
	}

	@Override
	public Users findUserbyId(String username) throws UserNotFoundException {
		return NetflixRepo.findById(username).get();
	}

	@Override
	public List<Users> getAllUser() {
		return NetflixRepo.findAll();
	}

	@Override
	public Users deleteAUser(String username) {
		Users deletedNetflixUser = null;
		
		Optional optional = NetflixRepo.findById(username);
		
		if(optional.isPresent()) {
		deletedNetflixUser = NetflixRepo.findById(username).get();
		NetflixRepo.deleteById(username);
		}
		
		return deletedNetflixUser;
	}

	@Override
	public Users updateAUser(Users netflixUser) {
		Users updatedNetflixUser = null;
		
		Optional optional = NetflixRepo.findById(netflixUser.getId());
		
		if (optional.isPresent()) {
			Users getUser = NetflixRepo.findById(netflixUser.getId()).get();
			getUser.setEmailid(netflixUser.getEmailid());
			getUser.setMobno(netflixUser.getMobno());
			getUser.setName(netflixUser.getName());
			getUser.setPassword(netflixUser.getPassword());
			
			updatedNetflixUser = NetflixRepo.save(getUser);
		}
		
		return updatedNetflixUser;
	}

	@Override
	public Formdata formUser(Formdata formdata) throws UserAlreadyExistException {
		// TODO Auto-generated method stub
		return formRepo.save(formdata);
	}

	
	
}