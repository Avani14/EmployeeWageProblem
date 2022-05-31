
public class WageCalculation extends AbsentOrPresent{
	static short wage = 20;
	static short hours = 8;
	static short dailyWage;
	public WageCalculation()
	{
		if(attendance == 1)
		{
			dailyWage =  (short) (wage * hours);
			System.out.println("The employees daily wage is "+dailyWage);
		}
		else {
			System.out.println("The employee is absent so his today's wage is 0");
		}
	}
}
