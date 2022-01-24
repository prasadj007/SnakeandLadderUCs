package com.bridgelabz;


public class UC4PlayUntilWin {
	public static final int END = 100;
	public static void main(String[] args) {

		int position = 0,start=0,dice=0;

		while(position != END)
		{
			dice++;
			double randomcheck=(int)Math.floor(Math.random() * 10) % 6+1;
			double optionSwitch=(int)Math.floor(Math.random() * 10) % 3;
			switch ((int)optionSwitch)
			{
			case 0:
				System.out.println("Case of No Play");
				position += 0;
				break;
			case 1:
				System.out.println("Case of Ladder:");
				position += randomcheck;
				break;
			case 2:
				System.out.println("Case of Snake");
				position -= randomcheck;
				break;
			}
			if(position == 100)
			{
			break;
			}
			else if(position > 100)
			{
				position -= randomcheck;
				System.out.println("Spin dice Again Invalid Dice Face");
			}
			else if(position < 0)
			{
				position = start;
				System.out.println("Starting Point");
			}
			else
			{
				System.out.println("Current Position:"+ position);
			}
		}
		System.out.print("WIN");
	}
}