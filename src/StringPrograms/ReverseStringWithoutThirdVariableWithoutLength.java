package StringPrograms;

public class ReverseStringWithoutThirdVariableWithoutLength {
	public static void main(String[] args) {
		String str="gandhi";
		char ch[]=str.toCharArray();
		int count=0;
		for(char s:ch)
		{
		count++;	
		}
		System.out.println("The length of the string "+count);
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(""+str.charAt(i));
		}
	}

}
