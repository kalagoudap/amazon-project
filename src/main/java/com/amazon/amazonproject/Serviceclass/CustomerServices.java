package com.amazon.amazonproject.Serviceclass;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.amazon.amazonproject.ModelPack.CustomerReg;
import com.amazon.amazonproject.ModelPack.itemclass;
import com.amazon.amazonproject.ModelPack.loginclass;
import com.amazon.amazonproject.ModelPack.orderclass;
import com.amazon.amazonproject.ModelPack.updateclass;
import com.amazon.amazonproject.Repositorypack.crudoperations;
import com.amazon.amazonproject.Repositorypack.itemRepository;
import com.amzon.Execptionpack.LoginUnsuccessfull;

@Service
public class CustomerServices
{

	@Autowired
	private JavaMailSender mailsender;
	
	private SimpleMailMessage template;
	
	private String mail;
	
	
	@Autowired
	itemRepository itemrepo;
	
	@Autowired
	itemdetails details;
	
	orderclass order;

	 
	@Autowired
	crudoperations oper;

	String name;

	String id;
	
	public String loginService(HttpServletResponse respo,loginclass obj) throws IOException
	{
		int flag=0;
		name=obj.getUsername();
		List<CustomerReg> l=(List<CustomerReg>) oper.findAll();
		if(obj.getSubmit().equals("ADMIN LOGIN"))
		{
			if(obj.getUsername().equals("KALAGOUDAP")&&obj.getPassword().equals("9448280363"))
			{
				respo.sendRedirect("admin.html");
			}
		}
		else {
			for(CustomerReg cust:l)
			{
				if(obj.getUsername().equals(cust.getNAME())&&obj.getPassword().equals(cust.getPASSWORD()))
				{
					id=cust.getID();
					//detail.setName(obj.getUsername());
					respo.sendRedirect("item.html");
					flag=1;
				}
				else if(flag==1)
				{
					break;
				}
				else
				{
					throw new LoginUnsuccessfull("LOGIN FAILED.....!!!!!!! PLEASE DO REGISTER");
				}
			}
		}
		return name;
	}
	
	
	public void Customerregister(HttpServletResponse response, CustomerReg SUBMIT) throws IOException
	{
		template=new SimpleMailMessage();
		Random r=new Random();
		String id=UUID.randomUUID().toString();
		//CustomerReg.setRAND(number);
		CustomerReg reg=SUBMIT;
		reg.setID(id);
		if(reg!=null)
		{
			oper.save(reg);
			template.setFrom("kalagoudapatil508@gmail.com");
			template.setTo(reg.getEMAIL());
			template.setSubject("REGISTRATION SUCCESSFUL");
			template.setText("dear "+reg.getNAME());
			template.setText("    YOUR REGISTRATION SUCCESSFULLY DONE THANK YOU....!!!!");
			
			mailsender.send(template);
		}
		else
		{
			 throw new LoginUnsuccessfull("REGISTRATION GOT UNSUCCESSFULL SO PLEASE DO REGISTER AGAIN");
		}

		response.sendRedirect("index.html");
	}
	
	public CustomerReg updateregister(updateclass updates)
	{

		Optional<CustomerReg> record=oper.findById(id);
		CustomerReg details=record.get();
		
		if(updates.getADDRESS()!="")
			details.setADDRESS(updates.getADDRESS());

		if(updates.getAGE()!=null)
			details.setAGE(updates.getAGE());
		
		if(updates.getEMAIL()!="")
			details.setEMAIL(updates.getEMAIL());
		
		if(updates.getNAME()!="")
			details.setNAME(updates.getNAME());
		
		if(updates.getPASSWORD()!="")
			details.setPASSWORD(updates.getPASSWORD());
		
		if(updates.getPHONENUMBER()!=null)
			details.setPHONENUMBER(updates.getPHONENUMBER());
		
		if(updates.getPINCODE()!=null)
			details.setPINCODE(updates.getPINCODE());
		

		oper.save(details);
		return details;
	}
	
	public void deleteaccount(HttpServletResponse response) throws IOException
	{
		oper.deleteById(id);
		response.sendRedirect("index.html");
	}
	
	public String orderservice(itemclass item)
	{
		CustomerReg customerobject=oper.findById(id).get();
		itemrepo.save(item);
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setFrom("kalagoudapatil508@gmail.com");
		mail.setTo(customerobject.getEMAIL());
		mail.setSubject("OREDER IS CONFORMED");
		
		if(item.getLaptopbrand().equals("aceraspiron7"))
		{
			order=details.aceraspiron7();
				
		}
		if(item.getLaptopbrand().equals("acerswift"))
		{
			order=details.acerswift();
				
		}
		if(item.getLaptopbrand().equals("aceraspiron5"))
		{
			order=details.aceraspiron5();
				
		}
		if(item.getLaptopbrand().equals("acerprediator1"))
		{
			order=details.acerprediator1();
				
		}
		if(item.getLaptopbrand().equals("acerprediator2"))
		{
			order=details.acerprediator2();
				
		}
		if(item.getLaptopbrand().equals("acerprediator3"))
		{
			order=details.acerprediator3();
				
		}
		mail.setText("Dear "+customerobject.getNAME()+" your order Conformed to the address "
				+customerobject.getADDRESS()+" item name "+order.getBrandname()+" laptop RAM and ROM"
				+order.getRam()+" "+order.getRom()+" your phone number "+customerobject.getPHONENUMBER());
		mailsender.send(mail);
		return "THANK YOU ORDER PLACED";
	}

}
