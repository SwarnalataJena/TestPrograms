package StringPrograms;

public class WordContainO {
	public static void main(String[] args) {
		String str="Hello how are you";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			
			if(s[i].contains("o"))
			{
				System.out.println(s[i]);

			}
			
		}
	}

}
