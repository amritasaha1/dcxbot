package com.cap.dcx.beans;

/**
 * 
 * @author amrisaha
 * Model class for Button object in ResponseCard
 *
 */
public class Button {
	
	private String text;
	private String value;
	
	/**
	 * Constructor
	 * @param text
	 * @param value
	 */
	public Button(String text, String value) {
		this.text = text;
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
