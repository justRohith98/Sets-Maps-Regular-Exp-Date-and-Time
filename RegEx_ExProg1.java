package regular_expressions;

public class RegEx_ExProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String patt="www.(dezlearn|dez).(com|us)";
String str1="www.dez.us";
System.out.println(str1.matches(patt));
	}

}
