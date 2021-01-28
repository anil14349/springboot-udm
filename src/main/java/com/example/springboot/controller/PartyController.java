package com.example.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.pojo.Party;
import com.example.springboot.service.CCService;

@RestController
public class PartyController {

	@Autowired
	CCService ccService;
	
	@RequestMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value = "/hello/{id}", method = RequestMethod.GET, produces = { "application/json"}, headers = {"Accept=application/json","Accept=application/xml"})
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Party> hello(@PathVariable(value = "id", required = false, name = "id") long id,
			@RequestParam(value = "rid", required = false, defaultValue = "1234") long rid) {
		return  ccService.getParties();
	}

}
