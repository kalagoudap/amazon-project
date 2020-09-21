package com.amazon.amazonproject.ConfigPack;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SmtpConfiguration {
	
	@Bean
	public JavaMailSender getJavaMailSender() {
		
		JavaMailSenderImpl javaMailSenderimpl = new JavaMailSenderImpl();
		javaMailSenderimpl.setHost("smtp.gmail.com");
		javaMailSenderimpl.setPort(587);
		javaMailSenderimpl.setUsername("kalagoudapatil508@gmail.com");
		javaMailSenderimpl.setPassword("awzfusymxvxkhlbg");
		Properties props = javaMailSenderimpl.getJavaMailProperties();
		props.put("mail.transport.protocol","smtp");
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.debug","true");
		
		return javaMailSenderimpl;
		
	}
	
	@Bean
	public RestTemplate templateobj()
	{
		return new RestTemplate();
	}

}
