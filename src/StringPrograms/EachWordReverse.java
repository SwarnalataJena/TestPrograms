package StringPrograms;
//input how are you
//output woh era uoy
public class EachWordReverse {
	public static void main(String[] args) {
		String str="how are you";
		String s[]=str.split(" "); 
		
		for(int i=0;i<s.length;i++)
		{
			String strr=s[i];
			String res="";
			for(int j=0;j<s.length;j++)
			{
				res=strr.charAt(j)+res;
			}
			System.out.print(res+" ");
		}
		
	}
}
