
public class ConditionSatisfy extends WageCalculation{
	static short days = 1;
	public static void conditionCheck()
	{
		while(hours<100 && days<20)
		{
			dailyWage += (short) (wage * hours);
			dailyWagePart +=  (short) (wage * hoursPartTime);
			System.out.println("Wage till day "+days+" is "+dailyWage);
			System.out.println("Wage of part time employee till day  "+days+" is "+dailyWagePart);
			days++;
			hours+=8;
			
		}
		System.out.println("---------------");
		System.out.println("Total wage till 100 hours and 20 days is "+dailyWage);
		System.out.println("Total wage of part time emp till 100 hours and 20 days is "+dailyWagePart);
	}
}
