package com.reset.Utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import com.reset.Interface.IUtility;

public class UtilityImpl implements IUtility {

	@Override
	public String generateMD5Password(String password) {
		
        String generatedPassword = null;
        try {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(password.getBytes());
        byte[] bytes = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        generatedPassword = sb.toString();
	}
        catch(NoSuchAlgorithmException e){
        	 e.printStackTrace();
        }
		return generatedPassword;

}
}
