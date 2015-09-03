package accessmodifier17A;
                                                                    // EJ Media --17 //
public  class ClassTemplate {

	int day = 1; //visible to the package.the default.no modifier is needed//
	public int week = 7; //visible to the world //
	protected int month = 31; //visible to the package and all subclass //
	private int year = 365 ; //visible to the class only most restrictive //
	
	public int printweek () {  //method use all 4 but most common public //
		return day + week + month + year;
		
		
		
		
	
	
	
		
	}

}
