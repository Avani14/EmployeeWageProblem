
public class MonthlyWage extends WageCalculation{
	static short monthlyWage;
	static short monthlyWagePartTime;
	public MonthlyWage(){
		monthlyWage = (short) (dailyWage*20);
		monthlyWagePartTime = (short) (dailyWagePart*20);
		System.out.println("Monthly wage of employee is "+monthlyWage);
		System.out.println("Monthly wage of part time employee is "+monthlyWagePartTime);
		
	}
}
