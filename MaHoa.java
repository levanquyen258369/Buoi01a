package EncodeDecode;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class MaHoa {
	
	//Encode String
	public static String encodeString(String text) {
		String encodeString = null;
		try {
			encodeString = Base64.getEncoder().encodeToString(text.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encodeString;	
	}
	//Decode String
	public static String decodeString(String encodeText) {
		byte[] decodeBytes = null;
		try {
			decodeBytes = Base64.getDecoder().decode(encodeText.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String str = new String(decodeBytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encodeText;
	}
	// Encode Byte
	public static byte[] encodeByte(byte[] text) {
		byte[] encodeBytes = Base64.getEncoder().encode(text);
		return encodeBytes;
	}
	//Decode Byte
	public static byte[] decodeByte(byte[] encodeByteText) {
		byte[] decodeBytes = Base64.getDecoder().decode(encodeByteText);
		return decodeBytes;
	}
}
