package StringPrograms;
//input how are you
//output How Are You

public class EachWordUpperCase {
	public static void main(String[] args) {
		String s="how are you";
		String str[]=s.split(" ");
		String res="";
		for(int i=0;i<str.length;i++)
		{
			String strr=str[i];
			String fl=strr.substring(0, 1).toUpperCase();
			String rl=strr.substring(1).toLowerCase();
			res=res+fl+rl+" ";
		}
		System.out.println(res);
	}
}
