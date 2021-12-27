package com.text.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.text.form.Register;
import com.text.repository.CrudRepo;

@Service
public class CrudService {
	
	@Autowired
	private CrudRepo crudRepo;
	
	public Register signUp(Register register) {
	Register result = crudRepo.save(register);
		return result;
	}

	public Register getById(long id) {
		Register result = crudRepo.findById(id).get();
		return result;
	}

	
	
	public boolean deleteById(long id) {
		boolean flag = false ;
		try {
			this.crudRepo.deleteById(id);
			flag = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public Register updateSignUpUser(Register register) {
		Register result = crudRepo.save(register);
		return result;
	}

	
	

	
}
