package Logical;

public class CamelCase 
{
	static String toCamelCase(String s){
		   String[] parts = s.split("_");
		   String camelCaseString = "";
		   for (String part : parts){
		      camelCaseString = camelCaseString + toProperCase(part);
		   }
		   return camelCaseString;
		}

		static String toProperCase(String s) {
		    return s.substring(0, 1).toUpperCase() +
		               s.substring(1).toLowerCase();
		}


public static void main(String[] args) 
{
    String start = "THIS_IS_A_TEST";
    StringBuffer sb = new StringBuffer();
    for (String s : start.split("_")) {
        sb.append(Character.toUpperCase(s.charAt(0)));
        if (s.length() > 1) {
            sb.append(s.substring(1, s.length()).toLowerCase());
        }
    }
    System.out.println(sb);
}


}
