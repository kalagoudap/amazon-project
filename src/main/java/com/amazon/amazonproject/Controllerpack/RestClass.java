package com.amazon.amazonproject.Controllerpack;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amazon.amazonproject.ModelPack.CustomerReg;
import com.amazon.amazonproject.ModelPack.itemclass;
import com.amazon.amazonproject.ModelPack.loginclass;
import com.amazon.amazonproject.ModelPack.updateclass;
import com.amazon.amazonproject.Serviceclass.CustomerServices;

@RestController
@RequestMapping("/customer")
public class RestClass 
{

	@Autowired
	CustomerServices surv;
	
	@Autowired
	RestTemplate template;
	
	@PostMapping(path="/login")
	public void loginform(HttpServletResponse response, loginclass obj) throws IOException
	{
		surv.loginService(response, obj);
	}

	@PostMapping("/registration")
	public void customerdata(HttpServletResponse response,CustomerReg SUBMIT) throws IOException
	{
		surv.Customerregister(response, SUBMIT);
	}
	
	//sir html not support update request it has only get and post method so i used RequestMapping not UpdateMapping
	
	@RequestMapping(path = "/update",method = RequestMethod.POST, consumes="application/x-www-form-urlencoded")
	public CustomerReg update(updateclass updates)
	{
		return surv.updateregister(updates);
	}

	@RequestMapping(path="/delete", produces="text/html")
	public void delete(HttpServletResponse response) throws IOException
	{
		surv.deleteaccount(response);
	}
	
	@PostMapping("/buyproduct")
	public String orderplace(itemclass item)
	{
		return surv.orderservice(item);
	}
}

