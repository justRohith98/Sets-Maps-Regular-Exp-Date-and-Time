package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greedy_lazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1="XXasdfghYYqwertyuioXXtghjkYYvbnmXXbnmYYvbnm";
		String patt ="XX.*YY";
		Pattern p =Pattern.compile(patt);
		Matcher m=p.matcher(Str1);
System.out.println(m,results().count());
m.reset();
while(m.find()) {
	System.out.println("Starts at:"+m.start());
	System.out.println(m.group());
}
	}

}
