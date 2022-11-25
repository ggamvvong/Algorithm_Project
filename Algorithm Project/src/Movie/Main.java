package Movie;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin=new Scanner(System.in);
		int ch=0;
		int num=0;
		String playmovie[]=new String [] {"1.Spiderman","2.Iron Man","3.Dark Knight","4.About Time","5.Intern"};
		
		char[][][] movie=new char[5][5][10];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				for(int k=0;k<10;k++)
				{
					movie[i][j][k]='O';
				}
			}
		}
		
		kiosk kio = new kiosk();
		do
		{
			System.out.println("*** 영화 예약 프로그램 ***");
			System.out.println("1. 상영 중 영화 확인");
			System.out.println("2. 좌석 확인(O:예약 가능, X:예약 불가능)");
			System.out.println("3. 좌석 예약");
			System.out.println("0. 종료");
			System.out.print("메뉴를 선택하시오 : ");
			ch=stdin.nextInt();
			
			switch(ch) 
			{
			case 1:
				for(int i=0;i<5;i++)
				{
					System.out.print(playmovie[i]);
					System.out.println();
				}
				break;
			case 2:
				System.out.print("좌석을 확인 할 영화를 선택해주세요 : ");
				num=stdin.nextInt();
				System.out.println("선택 영화 : "+playmovie[num-1]);
				kio.check(num-1, movie);
				break;
			case 3:
				System.out.print("좌석을 예약 할 영화를 선택해주세요 : ");
				num=stdin.nextInt();
				System.out.println("선택 영화 : "+playmovie[num-1]);
				kio.reservation(num-1, movie);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}while(ch!=0);
	}

}
