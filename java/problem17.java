
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
				ret = 9;
				break;
			case 20:
				ret = 6;
				break;
			}
		} else {
			switch (num) {
			case 30:
				ret = 6;
				break;
			case 40:
				ret = 5;
				break;
			case 50:
				ret = 5;
				break;
			case 60:
				ret = 5;
				break;
			case 70:
				ret = 7;
				break;
			case 80:
				ret = 6;
				break;
			case 90:
				ret = 6;
				break;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		int totalCount = 0;
		for(int num=1; num <= 20; num++) {
			if (num <= 5) {
				totalCount += getCount(num, 0);
			}
		}
		System.out.println(totalCount);
	}
}
