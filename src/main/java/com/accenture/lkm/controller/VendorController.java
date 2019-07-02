package com.accenture.lkm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.business.bean.VendorBean;

@RestController
public class VendorController {

	private static final Logger logger = LoggerFactory.getLogger(VendorController.class);
	
	/*
	 * Autowire the VendorService object
	 * 
	 * */
	// Your Code Here
	
	@GetMapping("/")
	public String index() {
		return "Welcome to Spring Boot Vendor Service API!";
	}

	
	/* 
	 * Method - getVendorDetails()
	 * Fetch all the vendor details using VendorService and store it inside a List
	 * Return a ResponseEntity object passing the list of vendor details
	 * 
	 */
	
	@GetMapping("/vendor/controller/getVendors")
	public ResponseEntity<List<VendorBean>> getVendorDetails() {
		// Your Code Here
		return null;		
	}
}
