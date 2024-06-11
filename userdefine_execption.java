package userdefineex;

public class userdefine {
	public static boolean validateMarks(int[] marks)  throws inavaildmarks{
		for(int value:marks)
		{
			if(value<0 || value>100) 
				throw new InvaildMarksException("Marks should be between 0 to 100");
		}
		return true;
	}
	
	public static float calculatePercentage(int[] marks) {
		int total = 0;
		for(int result : marks) {
			total+=result;
			float per=total/marks.length*100;
			return per;
		}
	}
}
