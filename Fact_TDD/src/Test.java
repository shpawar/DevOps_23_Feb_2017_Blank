
public class Test {
public static void main(String... s){
	int num=5;
		int firstvalue=num;
		int secondvalue=num-1;
		
		int intermediatefirstvalue=firstvalue*secondvalue;

		for(int i=num-2;i>0;i--)
		{
			int intermediatesecondvalue=intermediatefirstvalue*i;
			intermediatefirstvalue=intermediatesecondvalue;
			
		}
		System.out.println(intermediatefirstvalue);

}
}