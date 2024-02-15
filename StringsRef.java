package W3schoolExamples;
//Text
/*Java Strings
	Strings are used for storing text.

	A String variable contains a collection of characters surrounded by 
	double quotes:
	***Example***
Create a variable of type String and assign it a value:

String greeting = "Hello";
 */
public class Strings {
	public static void main(String[] args) {
		//Example
		/*String txt="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(txt.toLowerCase());
		System.out.println(txt.toUpperCase());
		*/
		//*************Finding a Character in a String***********************
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(str.indexOf("locate"));
		
		//*************All String Methods***********************
		//System.out.println("*************All String Methods***********************");
		//charAt()	Returns the character at the specified index (position)	char
		//System.out.println(str.charAt(9));
		//codePointAt()	Returns the Unicode of the character at the specified index	int
		//System.out.println(str.codePointAt(0));
		//codePointBefore()	Returns the Unicode of the character before the specified index	int
		//System.out.println(str.codePointBefore(5));
		//codePointCount()	Returns the number of Unicode values found in a string.	int
		//System.out.println(str.codePointCount(1, 5));
		
		//compareTo()	Compares two strings lexicographically	int
		String str2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		/*str=str.toLowerCase();
		int result=str.compareToIgnoreCase(str2);// compareToIgnoreCase() & compareTo
		if(result==0) {
			System.out.println("Strings are Compared");
		}
		else {
			System.out.println("Not Matched");
		}
		System.out.println(result);
		*/
		// Use the equals() method to compare two strings without consideration of Unicode values.
		//System.out.println(str.equals(str2));
		
		//concat()	Appends a string to the end of another string	String
		//System.out.println(str.concat("  "+str2));
		//contains()	Checks whether a string contains a sequence of characters	boolean
		//System.out.println(str2.contains("XYZ"));
		
		//contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
		//System.out.println(str.contentEquals(str2/*You Can Write Here Normal Text also and Match it Like = ABC*/));
		
		//copyValueOf()	Returns a String that represents the characters of the character array	String
		/*char[] tempval= {'H','e','l','l','o'};
		String str3="";
		str3=str3.copyValueOf(tempval);
		System.out.println(str3);*/
		
		//endsWith()	Checks whether a string ends with the specified character(s)	boolean
		//System.out.println(str.endsWith("OPQRSTUVWXYZ"));
	
		//startsWith()	Checks whether a string starts with specified characters	boolean
		//System.out.println(str.startsWith("ABCDEFGH"));
		
		//equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
		//System.out.println(str.equals(str2));
		
		//equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
		/*str=str.toLowerCase();
		System.out.println(str.equalsIgnoreCase(str2));*/
		
		//getBytes()	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	byte[]
		/*byte[] tempbyte=str.getBytes();
		System.out.println(tempbyte);*/
		
		//hashCode()	Returns the hash code of a string	int
		//indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
		//System.out.println(str.indexOf("W"));
		
		//isEmpty()	Checks whether a string is empty or not	boolean
		/*String emptystr="";
		System.out.println(str.isEmpty());
		System.out.println(emptystr.isEmpty());*/
		
		//lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
		//System.out.println(str.lastIndexOf("A"));
		
		//length()	Returns the length of a specified string	int
		//int l=str.length();
		//System.out.println(l);
		
		//matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
		//System.out.println(str.matches("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		
		//replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
		/*System.out.println("Before Replace : "+str);
		String tempstr="Nothing In This String";
		str=tempstr.replace(str, tempstr);
		System.out.println(str);*/
		
		//replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
		//System.out.println(str.replaceFirst("MN(.*)", "Test"));
		
		//replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
		//System.out.println(str.replaceAll("(.*)MN", "Testing"));
		
		//split()	Splits a string into an array of substrings	String[]
		/*String Temprep="Sachin@Kumar";
		String[] Tempvar=Temprep.split("@");
		for(int i=0;i<2;i++) {
			System.out.println(Tempvar[i]);
		}*/
		
		//startsWith()	Checks whether a string starts with specified characters	boolean
		//System.out.println(str.startsWith("ABC"));
		
		//subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
		//System.out.println(str.subSequence(1, 5));
		
		//substring()	Returns a new string which is the substring of a specified string	String
		//System.out.println(str.substring(24));
		
		//toCharArray()	Converts this string to a new character array	char[]
		/*char[] tempch=str.toCharArray();
		int l=str.length();
		int y=1;
		for(int i=0;i<l;i++) {
			System.out.println(y+" "+tempch[i]);
			y++;
		}*/
		
		//toLowerCase()	Converts a string to lower case letters	String
		//System.out.println(str.toLowerCase());
		
		//toString()	Returns the value of a String object	String
		//System.out.println(str.toString());
		
		//toUpperCase()	Converts a string to upper case letters	String
		//str=str.toLowerCase();
		//System.out.println(str.toUpperCase());
		
		//trim()	Removes whitespace from both ends of a string	String
		/*str=" "+str+" "+"Test";
		System.out.println(str);
		System.out.println(str.trim());*/
	}
}
