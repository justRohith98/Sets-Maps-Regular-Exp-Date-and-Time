package regular_expressions;

public class Reg_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str1="+1-678-675-@#(45678)";
    String str2 = str1.replace("+","").replace("-","").replace("-","").replace("(","").replace(")","");;
    System.out.println(str2);
    String patt="[^A-Za-z0-9]";
    String str3= str1.replaceAll(patt, "");
    System.out.println(str3);
    
	}

}
