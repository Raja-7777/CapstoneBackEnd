package com.example.demo.service;



import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.exception.UserAlreadyExistException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Formdata;
import com.example.demo.model.Users;
import com.example.demo.repository.FormdataRepo;
import com.example.demo.repository.NetflixUserRepo;

@ExtendWith(MockitoExtension.class)
class NetflixUserServiceImplTest {
	

		@Mock
		NetflixUserRepo userRepository;
		
		@Mock
		FormdataRepo applicationRepository;
		
		 @InjectMocks
		    private NetflixUserServiceImpl customeUserDetailsService;
		    private Users registeredusers, registeredusers1;
		    private Formdata applicationdata;
		    private List<Users> userList;
		    private Optional optional;
		
		@BeforeEach
		void setUp() throws Exception {
			MockitoAnnotations.initMocks(this);
			registeredusers = new Users("Raja", "Raja", "raja@gmail.com"," 8285069191", "Raja@123");
			registeredusers1 = new Users("Raja1", "Raja2", "raja123@gmail.com"," 9566774774", "Raja@12345");
	        optional = Optional.of(registeredusers);
	        applicationdata = new Formdata("Raja", "Raja", "Raja122333@gmail.com", "8870124412", "Raja@12345",
	        		"datainput", "datainput1", "datainput2", "datainput3", "datainput4", "datainput5","datainput6","datainput7");
		}
		@AfterEach
		void tearDown() throws Exception {	
			registeredusers=null;
		}
		
		@Test
		void testGetAllUser() {
			userRepository.save(registeredusers);
	        //stubbing the mock to return specific data
	        when(userRepository.findAll()).thenReturn(userList);
	        List<Users> userList1 = customeUserDetailsService.getAllUser();
	        assertEquals(userList, userList1);
	        verify(userRepository, times(1)).save(registeredusers);
	        verify(userRepository, times(1)).findAll();	
		}
		
		@Test
		void testFindUserbyId() throws UserNotFoundException {
			 when(userRepository.findById((String) any())).thenReturn(Optional.of(registeredusers));
			 Users retrieveduser = customeUserDetailsService.findUserbyId(registeredusers.getId());
		        verify(userRepository, times(1)).findById((String) any());	
		}
		@Test
		void testRegisterUser() throws UserAlreadyExistException {
			when(userRepository.save(any())).thenReturn(registeredusers);
	        assertEquals(registeredusers, customeUserDetailsService.registerUser(registeredusers));
	        verify(userRepository, times(1)).save(any());
			
		}
		@Test
		void testFormUser() throws UserAlreadyExistException {
			when(applicationRepository.save(any())).thenReturn(applicationdata);
	        assertEquals(applicationdata, customeUserDetailsService.formUser(applicationdata));
	        verify(applicationRepository, times(1)).save(any());
			
		}
	}
	
	

	


