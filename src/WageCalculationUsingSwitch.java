
public class WageCalculationUsingSwitch extends AbsentOrPresent{
	public WageCalculationUsingSwitch()
	{
		switch ((int)attendance)
		{
		case 1:
			WageCalculation.dailyWage =  (short) (WageCalculation.wage * WageCalculation.hours);
			System.out.println("The employees daily wage is "+WageCalculation.dailyWage);
			
			WageCalculation.dailyWagePart =  (short) (WageCalculation.wage * WageCalculation.hoursPartTime);
			System.out.println("The part time employee's daily wage is "+WageCalculation.dailyWagePart);
		case 0:
			System.out.println("The employee is absent so his today's wage is 0");
		}
		
	}
}
