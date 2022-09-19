package StringPrograms;

public class WordContainO {
	public static void main(String[] args) {
		String str="Hello how are you";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			int count=0;
			if(s[i].contains("o"))
			{
				count++;
			}
			if(count>=1)
			{
				System.out.println(s[i]);
			}
		}
	}

}
