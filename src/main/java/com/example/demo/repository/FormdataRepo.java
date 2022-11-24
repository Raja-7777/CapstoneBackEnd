package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Formdata;

@Repository
public interface FormdataRepo extends JpaRepository<Formdata, String>{

}
