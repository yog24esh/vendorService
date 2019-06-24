package com.accenture.lkm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "Welcome to Vendor Service API!";
	}
}
