package com.amazon.amazonproject.ModelPack;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

@Entity
public class CustomerReg
{
	
	@Id
	private String ID;
	private long PHONENUMBER;
	private String NAME;
	private String PASSWORD;
	private String CONFORMPASSWORD;
	private String EMAIL;
	private String ADDRESS;
	private int AGE;
	private int PINCODE;
	
	public String getID() {
		return ID;
	}
	public void setID(String rAND) {
		ID = rAND;
	}
	
	public long getPHONENUMBER() {
		return PHONENUMBER;
	}
	public void setPHONENUMBER(long pHONENUMBER) {
		PHONENUMBER = pHONENUMBER;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getCONFORMPASSWORD() {
		return CONFORMPASSWORD;
	}
	public void setCONFORMPASSWORD(String cONFORMPASSWORD) {
		CONFORMPASSWORD = cONFORMPASSWORD;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public int getPINCODE() {
		return PINCODE;
	}
	public void setPINCODE(int pINCODE) {
		PINCODE = pINCODE;
	}
	
}
