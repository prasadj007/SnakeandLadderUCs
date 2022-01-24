package com.bridgelabz;


public class UC7TwoPlayerPlay {
	
	public static final int END = 100;
	
	public static void main(String[] args) {

		int position1 = 0,position2=0,start=0,dice1=0,dice2=0;

		while(position1 <= END && position2 <= END)
		{
			dice1++;
			double randomcheck=(int)Math.floor(Math.random() * 10) % 6+1;
			double optionSwitch=(int)Math.floor(Math.random() * 10) % 3;
			switch ((int)optionSwitch)
			{
			case 0:
				System.out.println("Case of No Play");
				position1 += 0;
				break;
			case 1:
				System.out.println("Case of Ladder:");
				position1 += randomcheck;
				break;
			case 2:
				System.out.println("Case of Snake");
				position1 -= randomcheck;
				break;
			}
			if(position1 == 100)
			{
			break;
			}
			else if(position1 > 100)
			{
				position1 -= randomcheck;
				System.out.println("Spin dice Again Invalid Dice Face");
			}
			else if(position1 < 0)
			{
				position1 = start;
				System.out.println("Starting Point");
			}
			else
			{
				System.out.println("Current Position of Player 1:"+ position1);
			}
			
			dice2++;
			double randomcheck2=(int)Math.floor(Math.random() * 10) % 6+1;
			double optionSwitch2=(int)Math.floor(Math.random() * 10) % 3;
			switch ((int)optionSwitch2)
			{
			case 0:
				System.out.println("Case of No Play");
				position2 += 0;
				break;
			case 1:
				System.out.println("Case of Ladder:");
				position2 += randomcheck2;
				break;
			case 2:
				System.out.println("Case of Snake");
				position2 -= randomcheck2;
				break;
			}
			if(position2 == 100)
			{
			break;
			}
			else if(position2 > 100)
			{
				position2 -= randomcheck2;
				System.out.println("Spin dice Again Invalid Dice Face");
			}
			else if(position2 < 0)
			{
				position2 = start;
				System.out.println("Starting Point");
			}
			else
			{
				System.out.println("Current Position of Player2:"+ position2);
			}
			
			
		}
		System.out.println("\nPosition of Player 1:"+position1);
		System.out.println("Number of time the dice Rolled:" +dice1);
		System.out.println("Position of PLayer 2:" +position2);
		System.out.println("Number of time the dice Rolled:" +dice2);
		if(position1==END)
		{
			System.out.println("Player 1 is Winner");
		}
		else
			System.out.println("Player 2 is Winner");
	}
}