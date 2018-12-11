package lux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFloat {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		System.out.println("Digite o valor: ");
		String fl = in.readLine();
		try {
			float n =  Float.valueOf(fl);
		} catch (Exception e) {
			System.out.println("TQR TQR TQR");
		}
		System.out.println(fl);
	}

}
