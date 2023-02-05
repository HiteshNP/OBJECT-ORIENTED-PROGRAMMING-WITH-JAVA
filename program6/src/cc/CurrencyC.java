package cc;
import java.util.*;
public class CurrencyC 
{
double inr,usd;
double euro,yen;
Scanner in=new Scanner(System.in);

	public void dollartorupee()
	{
	System.out.println("Enter dollars to convert into Rupees:");
	usd=in.nextInt();
	inr=usd*81.83;
	System.out.println("Dollar ="+usd+" equal to INR="+inr);
	System.out.println("\n");
	}
	public void rupeetodollar()
	{
	System.out.println("Enter Rupee to convert into Dollars:");
	inr=in.nextInt();
	usd=inr/81.83;
	System.out.println("Rupee ="+inr+"equal to Dollars="+usd);
	System.out.println("\n");
	}
	public void eurotorupee()
	{
	
	System.out.println("Enter Euro to convert into Rupees:");
	euro=in.nextInt();
	inr=euro*79.06;
	System.out.println("Euro ="+euro+" equal to INR="+inr);
	System.out.println("\n");
	}
	public void rupeetoeuro()
	{
	System.out.println("Enter Rupees to convert into Euro:");
	inr=in.nextInt();
	euro=(inr/79.06);
	System.out.println("Rupee ="+inr +"equal to Euro="+euro);
	System.out.println("\n");
	}
	public void yentoruppe()
	{
	System.out.println("Enter Yen to convert into Rupees:");
	yen=in.nextInt();
	inr=yen*0.57;
	System.out.println("Yen ="+yen+" equal to INR="+inr);
	System.out.println("\n");
	}
	public void ruppetoyen()
	{
	System.out.println("Enter Rupees to convert into Yen:");
	inr=in.nextInt();
	yen=(inr/0.57);
	System.out.println("INR="+inr +"equal to YEN"+yen);
	System.out.println("\n");
	}
}