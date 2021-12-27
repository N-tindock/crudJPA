package com.text.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.text.form.Register;
import com.text.service.CrudService;

@RestController
@RequestMapping("/crudText")
public class CrudController {

	@Autowired
	private CrudService crudService;
	
	@PostMapping("/signUpUser")
	 public ResponseEntity<?> signUpUser(@RequestBody Register register) {
		try {
		Register result = this.crudService.signUp(register);
		return ResponseEntity.ok(result);
		}
		catch (Exception e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}	
	 }
	
	
	@PostMapping("/updateSignUpUser")
	 public ResponseEntity<?> updateSignUpUser(@RequestBody Register register) {
		try {
		Register result = this.crudService.updateSignUpUser(register);
		return ResponseEntity.ok(result);
		}
		catch (Exception e) {
       e.printStackTrace();
       return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}	
	 }
	
	@GetMapping("/getSignUpUser/{id}")
	 public ResponseEntity<?> getById(@PathVariable long id) {
		Register result = this.crudService.getById(id);
		return ResponseEntity.ok(result);
	 }
	

	@DeleteMapping("/deleteSignUpUser/{id}")
	 public ResponseEntity<?> deleteUser(@PathVariable long id) {
		boolean result = this.crudService.deleteById(id);
		if(result) {
			return ResponseEntity.ok("Delete Successfully!!");
		}else {
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	 }
}
