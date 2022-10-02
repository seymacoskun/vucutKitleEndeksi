package www.patika.dev;

import java.util.Scanner;

public class Kitle 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		double boy, kilo;
		System.out.println("Boyunuzu (metre cinsinde) giriniz: ");
		boy = inp.nextDouble();
		System.out.println("Kilonuzu giriniz: ");
		kilo = inp.nextDouble();
		double index = kilo/(boy*boy);
		System.out.println("Vücut kitle indeksiniz: " +index);
		
		if (index>=20 && index<25)
			System.out.println("Sağlıklısınız :)");
		else
			System.out.println("Sağlıksızsınız :(");
	}
}
