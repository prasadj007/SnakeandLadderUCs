package com.bridgelabz;

public class UC3PlayOption {
	public static void main(String[] args) {
		
	int position = 0;
	double randomcheck=Math.floor(Math.random() * 10) % 6+1;
	double optionSwitch=Math.floor(Math.random() * 10) % 3;
	switch ((int)optionSwitch)
	{
	case 0:
		System.out.println("Case of No Play");
		position += 0 ;
		System.out.println("Curent Position is"+position);
		break;
	case 1:
		System.out.println("Case of Ladder");
		position += randomcheck;
		System.out.println("Curent Position is"+position);
		break;
	case 2:
		System.out.println("Case of Snake");
		position -= randomcheck;
		System.out.println("Curent Position is"+position);
		break;
	}

}
}