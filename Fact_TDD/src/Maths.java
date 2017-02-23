
public class Maths {
	
	public int getFact(int num)
	{
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		if(num==0)
		{
			return 1;
		}
		if(num==1)
		{
			return 1;
		}

			int firstvalue=num;
			int secondvalue=num-1;
			int intermediatefirstvalue=firstvalue*secondvalue;

			for(int i=num-2;i>0;i--)
			{
				int intermediatesecondvalue=intermediatefirstvalue*i;
				intermediatefirstvalue=intermediatesecondvalue;
				
			}
			return (intermediatefirstvalue);
	}

}
