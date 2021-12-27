package com.text.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.text.form.Register;

@Repository
public interface CrudRepo extends JpaRepository<Register, Long> {
	
	

}
