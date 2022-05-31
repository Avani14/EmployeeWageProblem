
public class WageCalculation extends AbsentOrPresent{
	static short wage = 20;
	static short hours = 8;
	static short hoursPartTime = 4;
	static short dailyWage;
	static short dailyWagePart;
	public WageCalculation()
	{
		if(attendance == 1)
		{
			dailyWage =  (short) (wage * hours);
			System.out.println("The employees daily wage is "+dailyWage);
			
			dailyWagePart =  (short) (wage * hoursPartTime);
			System.out.println("The part time employee's daily wage is "+dailyWagePart);
		}
		else {
			System.out.println("The employee is absent so his today's wage is 0");
		}
	}
}
