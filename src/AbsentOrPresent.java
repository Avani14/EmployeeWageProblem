
public class AbsentOrPresent {
	protected float attendance;
	public AbsentOrPresent(){
	
		attendance = (float) (Math.floor(Math.random()*10)%2);
        if(attendance == 1)
        {
            System.out.println("Employee is present today");
        }
        else {
            System.out.println("Employee is not present today");
        }
        
	
	}
}
