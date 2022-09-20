package StringPrograms;
//input hello this is too hard
// output hello too
public class WordEndWithO {
	public static void main(String[] args) {
		String s="hello this is too hard";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			String s1=str[i];
			for(int j=0;j<str.length;j++)
			{
				
				if(s1.charAt(s1.length()-1)=='o')
				{
				count++;	
				}
			}
			if(count>=1)
			System.out.println(s1+" ");
		}
	}

}
