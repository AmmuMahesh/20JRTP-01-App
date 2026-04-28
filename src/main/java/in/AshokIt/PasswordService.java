package in.AshokIt;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	public static String encode(String txt) 
	{
		 Encoder encoder = Base64.getEncoder();
		 return encoder.encodeToString(txt.getBytes());
	}

	public static String decoded(String encodedTxt) 
	{
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedTxt);
		String dec = new String(decode);
		return dec;
	}
	
	public static void main(String[] args) {
		String encode = PasswordService.encode("MaheshSoft");
		System.out.println(encode);
		String dec = PasswordService.decoded(encode);
		System.out.println(dec);
	}

}
