package com.cap.dcx.beans;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The model class for LexRequest object
 * @author amrisaha
 *
 */
public class LexRequest {
	
    private String botName;
    private String intentName;
    private String score;
    private String type;
	private String credit;
	private String feature;
	private String thanks;
	private String filltypeintent;
	private String usercardintent;
	//private InvocationSource invocationSource = InvocationSource.FulfillmentCodeHook;
	//private OutputDialogMode outputDialogMode = OutputDialogMode.Text;
	private String error;
	private String firstName;
	private String lastName;
	private String address;
	private Map<String, Object> sessionAttributes = new LinkedHashMap<>();
	private String userId;
	private String inputTranscript;
	private UserIdType userIdType;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Map<String, Object> getSessionAttributes() {
		return sessionAttributes;
	}
	public void setSessionAttributes(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getInputTranscript() {
		return inputTranscript;
	}
	public void setInputTranscript(String inputTranscript) {
		this.inputTranscript = inputTranscript;
	}
	public UserIdType getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(UserIdType userIdType) {
		this.userIdType = userIdType;
	}
	public String getThanks() {
		return thanks;
	}
	public void setThanks(String thanks) {
		this.thanks = thanks;
	}
	public String getFilltypeintent() {
		return filltypeintent;
	}
	public void setFilltypeintent(String filltypeintent) {
		this.filltypeintent = filltypeintent;
	}
	public String getUsercardintent() {
		return usercardintent;
	}
	public void setUsercardintent(String usercardintent) {
		this.usercardintent = usercardintent;
	}
	public String getBotName() {
		return botName;
	}
	public void setBotName(String botName) {
		this.botName = botName;
	}
	public String getIntentName() {
		return intentName;
	}
	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}

	
}
