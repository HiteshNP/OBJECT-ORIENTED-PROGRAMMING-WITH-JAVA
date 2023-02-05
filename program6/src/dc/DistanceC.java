package dc;
import java.util.*;
public class DistanceC
{
double km,m,miles;
Scanner in=new Scanner(System.in);
	public void mtokm()
	{
	
	System.out.println("Enter the distance in meter");
	m=in.nextDouble();
	km=(m/1000);
	System.out.println(m+"m" +" is equal to "+km+"km");
	System.out.println("\n");
	}
	public void kmtom()
	{
	System.out.println("Enter the distance in Kilometer");
	km=in.nextDouble();
	m=km*1000;
	System.out.println(km+"km" +" is equal to "+m+"m");
	System.out.println("\n");
	}
	public void milestokm()
	{
	System.out.println("Enter the distance in miles");
	miles=in.nextDouble();
	km=(miles*1.60934);
	System.out.println(miles+"miles" +" is equal to "+km+"km");
	System.out.println("\n");
	}
	public void kmtomiles()
	{
	System.out.println("Enter the distance in km");
	km=in.nextDouble();
	miles=(km*0.621371);
	System.out.println(km+"km" +" is equal to "+miles+"miles");
	System.out.println("\n");
	}
}