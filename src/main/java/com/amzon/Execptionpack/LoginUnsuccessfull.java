package com.amzon.Execptionpack;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

@Component
@Scope("prototype")
@ResponseStatus(value=HttpStatus.UNAUTHORIZED)
public class LoginUnsuccessfull extends RuntimeException
{
	public LoginUnsuccessfull(String message)
	{
		System.out.println(message);
	}
}
