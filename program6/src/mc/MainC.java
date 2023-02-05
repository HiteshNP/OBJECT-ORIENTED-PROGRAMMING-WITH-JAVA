/*
Aim: Introduce the concept of Abstraction, packages.package mc;

Develop a java application to implement currency converter (Dollar to INR, EURO to INR,
Yen to INR and vice versa), distance converter (meter to KM, miles to KM and vice versa),
time converter (hours to minutes, seconds and vice versa) using packages.
*/

import cc.*;
import dc.*;
import tc.*;
public class MainC 
{
	public static void main(String args[])
	{
	CurrencyC obj=new CurrencyC();
	DistanceC obj1=new DistanceC();
	TimeC obj2=new TimeC();
	obj.dollartorupee();
	obj.rupeetodollar();
	obj.eurotorupee();
	obj.rupeetoeuro();
	obj.yentoruppe();
	obj.ruppetoyen();
	obj1.mtokm();
	obj1.kmtom();
	obj1.milestokm();
	obj1.kmtomiles();
	obj2.hourstominutes();
	obj2.minutestohours();
	obj2.hourstoseconds();
	obj2.secondstohours();
	}
}
