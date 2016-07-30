package assignment2;

public class cAssignment4 {

	public static void main(String[] args) {
		for(int i = 1; i < 13; i++)
			mGetDaysInMonth(i);
		
	}

	private static void mGetDaysInMonth(int lMonth) {
		
		if(lMonth < 1 || lMonth > 12)
		{
			System.out.println("Invalid Month");
			return;
		}
		
		switch(lMonth)
		{
			
			case 9:
			case 4:
			case 6:
			case 11:
			{
				System.out.println("Days in  " + lMonth + " = " + 30);
				break;
			}	
			case 2:
			{
				System.out.println("Days in " + lMonth + " = 28 /29" );
				break;
				
			}
				
			default:
			{
				System.out.println("Days in " + lMonth + " = " + 31);
				break;
			}
		}
		
	}

}

	