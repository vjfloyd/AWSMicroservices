package com.enel.ms.qr.login.service;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Test {


	public static void main(String[] args) throws UnsupportedEncodingException {
		  String key = "Bar12345Bar12345"; // 128 bit key
	      String initVector = "RandomInitVector";
	      String x =  Test.convertToMd5("123456789");
	      String pass = "25f9e794323b453885f5181f1b624d0b";//25f9e794323b453885f5181f1b624d0b
	      if(pass.equals(x)){
	    	  System.out.println("ok");
	      }else{
	    	  System.out.println("fuck");
	      }
		//System.out.println(decrypt2(key, initVector, "e10adc3949ba59abbe56e057f20f883e"));
	}
	
	@SuppressWarnings("null")
	public static String convertToMd5(final String md5) throws UnsupportedEncodingException {
		StringBuffer sb = null;
		try {
			final java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			final byte[] array = md.digest(md5.getBytes("UTF-8"));
			sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (final java.security.NoSuchAlgorithmException e) {
		}
		return sb.toString();
	}

//	 public static String decrypt(String key, String initVector, String encrypted) {
//	        try {
//	            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
//	            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
//
//	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
//	            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
//
//	            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));
//
//	            return new String(original);
//	        } catch (Exception ex) {
//	            ex.printStackTrace();
//	        }
//
//	        return null;
//	    }
	 
	 public static String decrypt2(String key, String initVector, String encrypted) {
		    try {
	            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
	            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
 
	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

	            byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));

	            return new String(original);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        return null;
	    }
}
