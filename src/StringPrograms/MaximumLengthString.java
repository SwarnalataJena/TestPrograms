package StringPrograms;

public class MaximumLengthString {
	public static void main(String[] args) {
		String str="welcome to testyantra";
		String s[]=str.split(" ");
		int max=0;
		String mls="";
		for(int i=0;i<s.length;i++)
		{
			String s1=s[i];
			
			if(s1.length()>max)
			{
				max=s1.length();
				mls=s1;
			}
			
		}
		System.out.print(mls);
	}

}
