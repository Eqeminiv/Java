package laborki;

import java.util.Scanner;

public class miesiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner scanner = new Scanner(System.in);
	//	int nrMiesiaca = scanner.nextInt();
	//	month(nrMiesiaca);
		
	//	scanner.close();
		Scanner scanner = new Scanner(System.in);
		//int r = scanner.nextInt();
		//System.out.print(Fibonacci(r));
		//System.out.print(SilniaIt(r));
		String pesel = scanner.nextLine();
		scanner.close();

		
	}
	
	public static boolean peselGood(String peselek)
	{
		int liczbaKontrolna = (9*Integer.parseInt(peselek.substring(0, 1))+7*Integer.parseInt(peselek.substring(1, 2))+3*Integer.parseInt(peselek.substring(2, 3))
				+1*Integer.parseInt(peselek.substring(3, 4))+9*Integer.parseInt(peselek.substring(4, 5))+7*Integer.parseInt(peselek.substring(5, 6))+3*Integer.parseInt(peselek.substring(6, 7))+
						1*Integer.parseInt(peselek.substring(7, 8))+9*Integer.parseInt(peselek.substring(8, 9))+7*Integer.parseInt(peselek.substring(9, 10)));

		if liczbaKontrolna
	}
	
	public static int SilniaIt(int n)
	{
		int wynik=1;
		for (int i=1;i<=n;i++)
		{
			wynik = wynik*i;
		}
		return wynik;
	}
	
	public static int SilniaRekt(int n)
	{
		if (n>=2)
		{
			return SilniaRekt(n-1)*n;
		}
		else
			return 1;
	}
	
	
	public static int Fibonacci(int n)
	{
		if (n > 2)
		{
			return (Fibonacci(n-2) + Fibonacci(n-1));
		}
		else
			return 1;
	}
	
	
	public static String month(int nr)
	{
		switch(nr){
		case 1:
			return "stycznia";
		case 2:
			return "lutego";
		case 3:
			return "marca";
		case 4:
			return "kwietnia";
		case 5:
			return "maja";
		case 6:
			return "czerwca";
		case 7:
			return "lipca";
		case 8:
			return "sierpnia";
		case 9:
			return "wrzesnia";
		case 10:
			return "pazdziernika";
		case 11:
			return "listopada";
		case 12:
			return "grudnia";
			
			
				
				
				
			
	}return "nic";
		}

}
