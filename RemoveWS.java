package Week_1;


public class  RemoveWS {
	public static String RemoveWhiteSpaces(String str) {
		str=str.replaceAll("\\s","");
		return str;
	}
	public static void main(String args[]) {
		String str ="J ava P rog ra m mi ng";
		str=RemoveWhiteSpaces(str);
		System.out.println(str);
	}
}

