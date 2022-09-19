package StringPrograms;
//input NarendraModi
//output nARENDRAmODI

public class ChangingLetterCase {
	public static void main(String[] args) {
		String s="NarendraModi";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]<='Z'&&ch[i]>='A')
			{
				ch[i]=(char) (ch[i]+32);	
			}
			else
			{
				ch[i]=(char)(ch[i]-32);
			}
			System.out.print(ch[i]);
		}
	}

}
