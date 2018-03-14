package com.cap.dcx.beans;

/**
 * 
 * @author amrisaha
 * Model class for Attachment Object in Response Card
 *
 */
public class Attachment {
	
    private Button[] buttons;
    private String subTitle;
    private String title;
    
    /**
     * Constructor 
     * @param buttons
     * @param subTitle
     * @param title
     */
	public Attachment(Button[] buttons, String subTitle, String title) {
		this.buttons = buttons;
		this.subTitle = subTitle;
		this.title = title;
	}
	
	public Button[] getButtons() {
		return buttons;
	}
	public void setButtons(Button[] buttons) {
		this.buttons = buttons;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
