import java.util.Scanner;
public class Course0716{
	public static void main(String[] args){
		
		
		/*
		//打印乘法口诀表
		System.out.print("Enter a num:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+ " * "+j+" = "+(i*j)+"    ");
			}
			System.out.println();
		}
		*/
		
		
		/*
		//将营业税值显示为小数点后两位
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchase amount:");
		double purchaseAmount = input.nextDouble();
		double tax = purchaseAmount*0.06;
		System.out.println("Sales tsx is $"+(int)(tax*100)/100.0);
		*/
		
		
		/*
		显示当前时间   
		通过调用 System.currentTimeMillisO 返回当前时间
		小时：分钟 ：秒    
		currentTimeMillis 返回从 GMT 1970 年 1 月 1 日 00:00:00 开始到当前时刻的毫秒数
		1.调用System.currentTimeMillis()方法获取1970年1月1日午夜到现在的毫秒数，并存放在变童totalMilliseconds中。
        2.通过将总毫秒数totalMilliseconds除以1000得到总秒数totalSeconds。
        3.通过totalSeconds%60得到当前的秒数。
        4.通过将totalSeconds除以60得到总的分钟数totalMinutes。
        5.通过totalMinutes%60得到当前分钟数。
        6.通过将总分钟数totalMinutes除以60获得总的小时数totalHours。
        7.通过totalHours%24得到当前的小时数。
		
		//ShowCurrentTime
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds/1000;
		long currentSecond = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentMinute = totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currentHour = totalHours%24;
		System.out.println("Current time is "+currentHour+":"+currentMinute+
		":"+currentSecond+"GMT");
		*/
		
		
        /*
		//Celsius =(5/9)(fahrenheit - 32)华氏温度转换成摄氏温度
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit:");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0/9)*(fahrenheit-32);
		System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+" in Celsius");
		*/
		
		
		/*
		//秒->分钟+秒
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer for seconds:");
		int seconds = input.nextInt();
		int minutes = seconds/60;
		int remainingSeconds = seconds%60;
		System.out.println(seconds+" "+"seconds is"+" "+minutes+" "
		+"minutes and"+" "+remainingSeconds+" "+"seconds");
		*/
		
	
        /*
		//求3个数的平均值
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers:");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
	    double average = (number1 + number2 + number3)/3;
		System.out.println(" The average of " + number1 + " " +
		number2 + " " + number3 + " " + "is" + " " + average );
		*/
		
		
		/*	
		//面积
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();
		double area = radius*radius*PI;
		System.out.println(" The area for the circle of radius " + radius 
		+ " is " + area);
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();
		double area = radius * radius * 3.14159;
		System.out.println(" The area for the circle of radius " + radius 
		+ " is " + area);
		
		double radius = 20.0;
		double area;
		area = radius * radius * 3.14159;
	    System.out.println(" The area for the circle of radius " + radius 
		+ " is " + area);
		*/
		
		
		/*System:
		System.out.println(3.5*4/2-2.5);       //4.5
		System.out.println("3.5*4/2-2.5 is");  //"3.5*4/2-2.5 is"
		System.out.println((10.5+2*3)/(45-3.5));
		System.out.println("Welcome to java");
		System.out.println("Programming is fun!");
		System.out.println("Fundamentals First");
		System.out.println("Problem Driven");*/
		
	}
}