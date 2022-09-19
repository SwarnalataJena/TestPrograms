package StringPrograms;
//input ssooofffffjjssss
//output s2o3f5j2s4

public class FrequencyCount {
	public static void main(String[] args) {
		String str=	"ssooofffffjjssss";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					i++;
				}
				else
				{
					break;
				}
				
			}
			System.out.print(ch[i]+""+count);
		}

	}

}
