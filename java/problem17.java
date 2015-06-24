
public class problem17 {
	public static int getCount(int num, int type) {
		int ret = 0;
		if (type == 0) {
			switch(num) {
			case 1: //one
				ret = 3;
				break;
			case 2: //two
				ret = 3;
				break;
			case 3: //three
				ret = 5;
				break;
			case 4: // four
				ret = 4;
				break;
			case 5:
				ret = 4;
				break;
			case 6: // six
				ret = 3;
				break;
			case 7: // seven
				ret = 5;
				break;
			case 8: // eight
				ret = 5;
				break;
			case 9: // nine
				ret = 4;
				break;
			case 10: // ten
				ret = 3;
				break;
			case 11: // eleven
				ret = 6;
				break;
			case 12:
				ret = 6;
				break;
			case 13:
				ret = 8;
				break;
			case 14:
				ret = 8;
				break;
			case 15:
				ret = 7;
				break;
			case 16:
				ret = 7;
				break;
			case 17:
				ret = 9;
				break;
			case 18:
				ret = 8;
				break;
			case 19:
				ret = 8;
				break;
			case 20:
				ret = 6;
				break;
			}
		} else {
			switch (num) {
			case 1:
				ret = 3;
				break;
			case 2:
				ret = 6;
				break;
			case 3:
				ret = 6;
				break;
			case 4:
				ret = 5;
				break;
			case 5:
				ret = 5;
				break;
			case 6:
				ret = 5;
				break;
			case 7:
				ret = 7;
				break;
			case 8:
				ret = 6;
				break;
			case 9:
				ret = 6;
				break;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		int totalCount = 0;
		for(int num=1; num <= 1000; num++) {
			if (num <= 20) {
				totalCount += getCount(num, 0);
			} else if (num < 100) {
				if (num <= 20) {
					totalCount += getCount(num, 0);
				} else if (num < 30) {
					int onesDigit = num % 20;
					totalCount += getCount(onesDigit, 0);
					totalCount += 6;
				} else {
					int tensDigit = num / 10;
					int onesDigit = num % 10; 
					totalCount += getCount(onesDigit, 0);
					totalCount += getCount(tensDigit, 1);
				}
			} else if (num < 1000) {
				int whichHundred = num / 100;
				int rem = num % 100;
				int tensDigit = 0, onesDigit = 0;
				totalCount += (getCount(whichHundred, 0) + 7);
				if (rem <= 20) {
					onesDigit = rem;
					totalCount += getCount(rem, 0);
				} else if (rem < 30) {
					onesDigit = rem % 20;
					totalCount += getCount(onesDigit, 0);
					totalCount += 6;
				} else {
					tensDigit = rem / 10;
					onesDigit = rem % 10; 
					totalCount += getCount(onesDigit, 0);
					totalCount += getCount(tensDigit, 1);
				}
				if (tensDigit != 0 || onesDigit != 0) {
					totalCount += 3;
				}
			} else {
				totalCount += 11;
			}
		}
		System.out.println(totalCount);
	}
}
