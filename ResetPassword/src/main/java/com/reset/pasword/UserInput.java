package com.reset.pasword;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserInput")
public class UserInput implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String userInput;
	
	private String inputType;

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}
}
