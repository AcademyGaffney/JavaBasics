package com.academygaffney.javabasics.session3;

public class CodingBatOne {

	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation)
			return true;
		else
			return false;
	}

	public boolean hasTeen(int a, int b, int c) {
		if ((a >= 13 && a <= 19))
			return true;
		else if (b >= 13 && b <= 19)
			return true;
		else if (c >= 13 && c <= 19)
			return true;
		else
			return false;
	}

	public boolean loneTeen(int a, int b) {
		if ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19))
			return true;
		else
			return false;
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (cigars >= 40 && cigars <= 60)
			return true;
		else if (cigars >= 40 && isWeekend)
			return true;
		else
			return false;
	}

}
