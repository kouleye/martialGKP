package main.java;

public class Calcul {
	public int addition(int a, int b) {
		int res = a;
		if (b > 0) {
			while (b-- != 0) {
				res++;
			}
		} else if (b < 0) {
			while (b++ != 0) {
				res--;
			}
		}
		return res;
	}

	public int multiplication(int a, int b) {
		if(a==0||b==0) return 0;
		int res = a;
		if (b > 0) {
			while (--b != 0) {
				res = res + a;
			}
		} else if (b < 0  && a >0) {
			res=-1*res;
			while (++b != 0) {
				res = res -a;
			}
		}else if (b < 0  && a <0) {
			res=-1*res;
			while (++b != 0) {
				res = res -a;
			}
		}

		return res;
	}

}
