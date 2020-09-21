package com.amazon.amazonproject.ModelPack;

import org.springframework.stereotype.Component;

import com.sun.istack.Nullable;

@Component
public class updateclass
{
	private String RAND; 
	@Nullable
	private Long PHONENUMBER;
	@Nullable
	private String NAME;
	@Nullable
	private String PASSWORD;
	@Nullable
	private String CONFORMPASSWORD;
	@Nullable
	private String EMAIL;
	@Nullable
	private String ADDRESS;
	@Nullable
	private Integer AGE;
	@Nullable
	private Integer PINCODE;
	
	public String getRAND() {
		return RAND;
	}
	public void setRAND(String rAND) {
		RAND = rAND;
	}
	public Long getPHONENUMBER() {
		return PHONENUMBER;
	}
	public void setPHONENUMBER(Long pHONENUMBER) {
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
	public Integer getAGE() {
		return AGE;
	}
	public void setAGE(Integer aGE) {
		AGE = aGE;
	}
	public Integer getPINCODE() {
		return PINCODE;
	}
	public void setPINCODE(Integer pINCODE) {
		PINCODE = pINCODE;
	}

}
