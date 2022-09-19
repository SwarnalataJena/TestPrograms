package StringPrograms;
//input s1=radhe s2=mohan 
//output s1=mohan s2=radhe

public class StringSwopping {
	public static void main(String[] args) {
		String s1="Radhe";
		String s2="Mohan";
        s1=s1+s2;
        s2=s1.substring(0, s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
	}
}
