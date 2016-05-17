package HW1;

import java.io.*;

public class Nuke2 {

	
	public static void main(String[] arg) throws Exception{
		BufferedReader Keyboard; 
		Keyboard =  new BufferedReader(new InputStreamReader(System.in));
		String inputLine = Keyboard.readLine();
				
		for(int i = 0; i<inputLine.length(); i++){
			if(i != 1){
			    System.out.append(inputLine.charAt(i));
			}
		}
	}
}
