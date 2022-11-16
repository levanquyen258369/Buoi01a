package EncodeDecode;

import java.io.UnsupportedEncodingException;

public class Converts {

	public static void main(String[] args) {
		//String to byte
		String textA = "Dinh cua tam Giac khong can!";
		System.out.println("Text before encode: "+textA);
		String resultA = MaHoa.encodeString(textA);
		System.out.println("Encode text: "+resultA);
		String originalA = MaHoa.decodeString(resultA);
		System.out.println("Decode text: "+originalA);

		//Byte to String
		byte[] resultB = MaHoa.encodeByte(textA.getBytes());
		String st1 = null;
		try {
			st1 = new String(resultB,"UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		System.out.println("Encode Byte To String: "+st1);
		byte[] originalB = MaHoa.decodeByte(resultB);
		String st2 = null;
		try {
			 st2 = new String(originalB, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("Decode Byte to String: "+st2 );	
	}

}
