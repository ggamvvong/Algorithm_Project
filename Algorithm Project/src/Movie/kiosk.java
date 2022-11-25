package Movie;

import java.util.Arrays;
import java.util.Scanner;

public class kiosk {
	
	Scanner stdin=new Scanner(System.in);
	
	public void check(int x, char [][][] movie)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Arrays.toString(movie[x][i]));
		}
	}
	public void reservation(int x, char [][][] movie)
	{
		int chnum=0;
		System.out.print("예약할 좌석의 수를 입력주세요 : ");
		chnum=stdin.nextInt();
		
		for(int i=0;i<chnum;i++)
		{
			int chx=0;
			int chy=0;
			System.out.print("예약할 행을 입력하세요 : ");
			chx=stdin.nextInt();
			
			System.out.print(chx+"행의 예약할 열을 입력하세요 : ");
			chy=stdin.nextInt();
			
			if(movie[x][chx-1][chy-1]=='O')
			{
				movie[x][chx-1][chy-1]='X';
				System.out.print(chx + "행 " + chy + "열에 예약했습니다.\n");
			}
			else
			{
				System.out.println("이미 에약이 되어있습니다.");
				i--;
			}
		}
	}
}
