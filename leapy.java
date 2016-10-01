public class leapy
{
	public int countleapyear(int a,int b)
	{
        int count=0;		
		int i;
		for(i=a;i<=b;i++)
		{
			if((i%4==0&&i%100!=0||i%400==0))
			{
				count=count+1;
			}	
		   
		}
        return count;	     
	}
}		
						
