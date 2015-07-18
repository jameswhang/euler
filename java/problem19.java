public class problem19 {
	public static int numDays(int month, int year) {
		switch(month) {
			case 1:
				return 31;
			case 2:
				if (month % 4 == 0 && (month % 400 == 0 || (month % 100 != 0))) {
					return 29;
				} else {
					return 28;
				}
			case 3:
				return 31;
			case 4:
				return 30;
			case 5:
				return 31;
			case 6:
				return 30;
			case 7:
				return 31;
			case 8:
				return 31;
			case 9:
				return 30;
			case 10:
				return 31;
			case 11:
				return 30;
			case 12:
				return 31;
		}
		return 1;
	}

    public static void main(String[] args) {
    	int year = 1900, mondayCount = 0, day = 1;
    	int month;

    	while(year <= 2000) {
    		month = 1;
    		while(month <= 12) {
    			int date = 1;
    			int numdays = numDays(month, year);
    			while(date <= numdays) {
    				if (day == 0 && date == 1 && year != 1900) {
    					mondayCount++;
    				}
    				day = (day + 1) % 7;
    				date++;
    			}
    			month++;
    		}
    		year++;
    	}
    	System.out.println(mondayCount);
	}
}
