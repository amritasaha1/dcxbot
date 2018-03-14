package com.cap.dcx.util;

import java.util.HashMap;
import java.util.Map;

import com.cap.dcx.beans.LexRequest;
import com.cap.dcx.beans.LexRequestAttribute;
import com.cap.dcx.beans.UserIdType;

import static org.apache.http.util.TextUtils.isEmpty;

/**
 * This class processes the user input and builds up LexRequest Class
 * @author amrisaha
 *
 */
public class LexRequestFactory {
	
	private final static String FACEBOOK_ID_PATTERN = "^\\d{16}$";
	
    public static LexRequest createLexRequest(Map<String, Object> input) {
        Map<String,Object> botMap = (Map<String,Object>) input.get("bot");
        String botName = (String) botMap.get("name");
        LexRequest lexRequest = new LexRequest();
        lexRequest.setBotName(botName);
        Map<String,Object> currentIntent = (Map<String,Object>) input.get("currentIntent");
        System.out.println(botMap.keySet().toString());
        System.out.println(currentIntent.keySet().toString());
        for (String key : currentIntent.keySet()) {
            System.out.println(key + " -- " + currentIntent.get(key));
        }
        //Map<String,Object> slotDetails = (Map<String,Object>) input.get("slotDetails");
        //System.out.println(slotDetails.keySet().toString());
       //lexRequest.setIntentName(currentIntent.toString());
        lexRequest.setCredit((String) input.get("credit"));
        lexRequest.setType((String)input.get("type"));
        lexRequest.setFeature((String) input.get("feature"));
        lexRequest.setScore((String)input.get("score"));
        lexRequest.setScore((String)input.get("usercardintent"));
        lexRequest.setScore((String)input.get("filltypeintent"));
        lexRequest.setScore((String)input.get("thanks"));
        //loadUserId(input,lexRequest);
        return lexRequest;
    }
    
;
    
    /**
     * 
     * @param input
     * @param request
     */
    private static void loadUserId(Map<String, Object> input, LexRequest request) {
        String userId = (String) input.get(LexRequestAttribute.UserId);
        System.out.println("userId -- " + userId);
        request.setUserId(userId);
        if(isEmpty(userId))
            request.setUserIdType(UserIdType.Undefined);
        else {
            if(userId.matches(FACEBOOK_ID_PATTERN)) {
            	 request.setUserId("FB Type");
            	 request.setUserIdType(UserIdType.Facebook);
            }else {
            	request.setUserIdType(UserIdType.Undefined);
            }
               
           
        }
    }
}
