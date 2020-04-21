package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_ExProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Your total cost is $24.99 after $0.99 sale discount and $12.09 coupon1 discount and $0.00 coupon2 discount";
String patt="${1}//d{1,}\\.\\d{1,}";
Pattern p =Pattern.compile(patt);
Matcher m=p.matcher(str1);
while(m.find()) {
	System.out.println(m.group());
}
	}

}
